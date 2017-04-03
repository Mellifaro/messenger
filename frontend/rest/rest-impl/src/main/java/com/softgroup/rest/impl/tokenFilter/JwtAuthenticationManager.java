package com.softgroup.rest.impl.tokenFilter;

import com.softgroup.common.token.api.TokenService;
import com.softgroup.common.token.api.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.03.2017.
 */
@Component
public class JwtAuthenticationManager implements AuthenticationManager {

    @Autowired
    private TokenService tokenService;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        JwtAuthenticationToken jwtToken = (JwtAuthenticationToken)authentication;
        authentication.setAuthenticated(tokenService.validateToken(jwtToken.getJwtToken(), TokenType.DEVICE_TOKEN));
        return authentication;
    }

    public boolean supports(Class<?> auth) {
        return auth.equals(JwtAuthenticationToken.class);
    }
}