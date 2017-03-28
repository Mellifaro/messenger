package com.softgroup.token.impl;


import com.softgroup.common.token.api.TokenService;
import com.softgroup.common.token.api.TokenType;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Виктор on 22.03.2017.
 */
@Component
public class TokenServiceImpl implements TokenService{
    private static final String KEY = "9F5E2F36DAE495B3897AF86BCBCD386D8912DE9E6B4F0FF472EB371C3F095A1D";
    private static final SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS256;

    @Override
    public String generateToken(String userId, Long timeleft, TokenType type, String deviceId) {
        Claims claims = Jwts.claims().setSubject(userId);
        claims.put("type", type);
        claims.put("deviceId", deviceId);

        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                .signWith(SIGNATURE_ALGORITHM, KEY);

        if(timeleft >= 0){
            long expMillis = System.currentTimeMillis() + timeleft;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    @Override
    public String getParameter(String jwtToken, String key) {
        try{
            Claims body = Jwts.parser()
                    .setSigningKey(KEY)
                    .parseClaimsJws(jwtToken)
                    .getBody();
            return (String) body.get(key);
        }catch (ClassCastException | JwtException e){
            return null;
        }
    }

    @Override
    public boolean validateToken(String jwtToken, TokenType type) {
        try{
            Claims body = Jwts.parser()
                    .setSigningKey(KEY)
                    .parseClaimsJws(jwtToken)
                    .getBody();
            return body != null
                    && body.get("type").equals(type)
                    && (Long) body.get("exp") > System.currentTimeMillis();
        }catch (ClassCastException | JwtException e){
            return false;
        }
    }
}