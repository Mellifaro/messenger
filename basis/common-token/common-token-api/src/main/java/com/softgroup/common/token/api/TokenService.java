package com.softgroup.common.token.api;

/**
 * Created by Виктор on 20.03.2017.
 */
public interface TokenService {

    String generateToken(String userId, Long timeleft, String typeToken);

    String getUserId(String jwtToken);
}
