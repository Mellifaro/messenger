package com.softgroup.token.impl;


import com.softgroup.common.token.api.TokenService;
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
    public String generateToken(String userId, Long timeleft, String typeToken) {
        Claims claims = Jwts.claims().setSubject(userId);
        claims.put("type", typeToken);


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
    public String getUserId(String jwtToken) {
        try{
            Claims body = Jwts.parser()
                    .setSigningKey(KEY)
                    .parseClaimsJws(jwtToken)
                    .getBody();
            return (String) body.get("sub");
        }catch (ClassCastException | JwtException e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean validateToken(String jwtToken){
        try{
            Claims body = Jwts.parser()
                              .setSigningKey(KEY)
                              .parseClaimsJws(jwtToken)
                              .getBody();
            System.out.println(body.getId());
            System.out.println(body.getSubject());
            return true;
        }catch (ClassCastException | JwtException e){
            e.printStackTrace();
            return false;
        }
    }

}
