package com.softgroup.common.token.api;

/**
 * Created by Виктор on 20.03.2017.
 */
public interface TokenService {

    //todo delete parameter timeleft?
    String generateToken(String userId, Long timeleft, TokenType type, String deviceId);

    String getParameter(String jwtToken, String key);

    boolean validateToken(String jwtToken, TokenType type);
}