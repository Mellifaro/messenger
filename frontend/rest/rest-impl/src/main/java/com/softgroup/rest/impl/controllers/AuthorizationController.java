package com.softgroup.rest.impl.controllers;

import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.rest.impl.CommonData;
import com.softgroup.rest.impl.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Виктор on 27.03.2017.
 */
@RestController
@RequestMapping(
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
        )
public class AuthorizationController {

    @Autowired
    private AuthorizationRouterHandler authorizationHandler;

    @Autowired
    private ParseUtil parseUtil;

    @RequestMapping(path = {"/login", "/register", "sms_confirm"})
    public String authorizate(HttpServletRequest request, HttpSession session) throws IOException {
        Request<CommonData> parsedRequest = parseUtil.parseHttpRequest(request, session);
        authorizationHandler.handle(parsedRequest);
        //todo finish method
        return "test1";
    }
}
