package com.softgroup.rest.impl.util;

import com.softgroup.token.impl.TokenServiceImpl;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.03.2017.
 */
//@Component
public class JwtAuthenticationManager implements AuthenticationManager {

//    @Autowired
    //todo change class to interface and autowire
    private TokenServiceImpl tokenService = new TokenServiceImpl();



    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        JwtAuthenticationToken jwtToken = (JwtAuthenticationToken)authentication;
        tokenService.validateToken(jwtToken.getJwtToken());
        authentication.setAuthenticated(true);
        return authentication;
    }

    public boolean supports(Class<?> auth) {
        return auth.equals(JwtAuthenticationToken.class);
    }
}
