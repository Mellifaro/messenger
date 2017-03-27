package com.softgroup.rest.impl.util;


import com.softgroup.common.exceptions.SoftgroupException;
import com.softgroup.common.token.api.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Виктор on 20.03.2017.
 */
//todo ready
@Component
public class JwtAuthenticationFilter extends GenericFilterBean{

    @Autowired
    private TokenService tokenService;

    private AuthenticationManager jwtAuthenticationManager = new JwtAuthenticationManager();

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String token = httpRequest.getHeader("Authorization");
        if(token == null){
            throw new SoftgroupException("No JWT token found in request headers");
        }

        JwtAuthenticationToken jwtToken = new JwtAuthenticationToken(token);
        SecurityContextHolder.getContext().setAuthentication(jwtAuthenticationManager.authenticate(jwtToken));
        HttpSession session = ((HttpServletRequest) request).getSession();

        //putting userId to session
        String userId = tokenService.getUserId(token);
        session.setAttribute("userId", userId);

        chain.doFilter(request, response);
    }
}

