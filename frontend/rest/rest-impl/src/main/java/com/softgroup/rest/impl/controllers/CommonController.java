package com.softgroup.rest.impl.controllers;

import com.softgroup.common.protocol.Request;
import com.softgroup.mainrouter.api.MainRouterHandler;
import com.softgroup.common.router.api.CommonData;
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
 * Created by Виктор on 21.03.2017.
 */
@RestController
@RequestMapping(
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class CommonController {

    @Autowired
    private MainRouterHandler mainRouter;

    @Autowired
    private ParseUtil parseUtil;

    @RequestMapping(path = "/**")
    public String handle(HttpServletRequest request, HttpSession session) throws IOException {
        Request<?> parsedRequest = parseUtil.parseHttpRequest(request, session);
        mainRouter.handle(parsedRequest);

        //todo finish method
        return "test";
    }
}
