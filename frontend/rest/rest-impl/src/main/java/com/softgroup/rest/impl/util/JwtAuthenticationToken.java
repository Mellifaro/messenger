package com.softgroup.rest.impl.util;

import com.auth0.jwt.impl.JWTParser;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by Виктор on 23.03.2017.
 */
//todo ready
public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    private static final long serialVersionUID = 789592771564968278L;
    private String jwtToken;

    public JwtAuthenticationToken(String jwtToken) {
        super(null);
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public Object getCredentials() {
        return null;
    }

    public Object getPrincipal() {
        return null;
    }
}
