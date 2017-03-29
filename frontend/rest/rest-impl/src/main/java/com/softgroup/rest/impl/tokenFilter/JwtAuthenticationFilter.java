package com.softgroup.rest.impl.tokenFilter;

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

    @Autowired
    private AuthenticationManager jwtAuthenticationManager;

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //receive jwt token from header "Authorization"
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String token = httpRequest.getHeader("Authorization");
        if(token == null){
            throw new SoftgroupException("No JWT token found in request headers");
        }

        //create authentication and delegates authentication process to the auth manager
        JwtAuthenticationToken jwtToken = new JwtAuthenticationToken(token);
        SecurityContextHolder.getContext().setAuthentication(jwtAuthenticationManager.authenticate(jwtToken));
        HttpSession session = ((HttpServletRequest) request).getSession();

        //put userId to session
        String userId = tokenService.getUserId(token);
        String sessionId = session.getId();
        session.setAttribute("userId", userId);
        session.setAttribute("sessionId", sessionId);

        chain.doFilter(request, response);
    }
}