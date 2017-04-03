package com.softgroup.rest.impl.tokenFilter;

import com.softgroup.common.token.api.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Виктор on 20.03.2017.
 */
@Component
public class JwtAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager jwtAuthenticationManager;

    @Autowired
    private AuthenticationSuccessHandler jwtAuthenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler jwtAuthenticationFailureHandler;

    public JwtAuthenticationFilter() {
        super("/**");
    }

    @PostConstruct
    public void init(){
        setAuthenticationSuccessHandler(jwtAuthenticationSuccessHandler);
        setAuthenticationFailureHandler(jwtAuthenticationFailureHandler);
        setAuthenticationManager(jwtAuthenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        JwtAuthenticationToken tokenAuthentication;

        //receive jwt token from header "Authorization"
        String token = httpServletRequest.getHeader("Authorization");
        if(token == null){
            tokenAuthentication = new JwtAuthenticationToken(null);
            tokenAuthentication.setAuthenticated(false);
            return tokenAuthentication;
        }
        tokenAuthentication = new JwtAuthenticationToken(token);
        Authentication authentication = getAuthenticationManager().authenticate(tokenAuthentication);

        HttpSession session = httpServletRequest.getSession();
        String userId = tokenService.getParameter(token, "sub");
        session.setAttribute("userId", userId);

        return authentication;
    }
}