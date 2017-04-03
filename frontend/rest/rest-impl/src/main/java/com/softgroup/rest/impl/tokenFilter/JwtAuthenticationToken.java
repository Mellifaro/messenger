package com.softgroup.rest.impl.tokenFilter;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created by Виктор on 23.03.2017.
 */
//todo ready
public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {

    private static final long serialVersionUID = 789592771564968278L;
    private String jwtToken;

    public JwtAuthenticationToken(String jwtToken) {
        super(null, null);
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

}