package com.softgroup.common.token.api;

/**
 * Created by Виктор on 20.03.2017.
 */
public interface TokenService {

    String generateToken(String userId, String deviceId, TokenType type);

    String getParameter(String jwtToken, String key);

    boolean validateToken(String jwtToken, TokenType type);
}