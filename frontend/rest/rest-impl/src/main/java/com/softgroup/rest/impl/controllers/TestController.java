package com.softgroup.rest.impl.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.mainrouter.api.MainRouterHandler;
import com.softgroup.common.router.api.SerObJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by Виктор on 21.03.2017.
 */
@RestController
@RequestMapping(
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.TEXT_PLAIN_VALUE
)
public class TestController {

    @Autowired
    private MainRouterHandler mainRouter;

    @Autowired
    private DataMapper dataMapper;

    @RequestMapping(path = "/*")
    public String handle(HttpServletRequest request, HttpSession session) throws IOException {
        String test = "";
        //Receiving post body
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            test = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        }

        //change this part of code
        Request<SerObJ> parsedRequest = dataMapper.mapData(test, new TypeReference<Request<SerObJ>>() {});
        parsedRequest.setUserId((String) session.getAttribute("userId"));

        //make parse method
        String[] parts = test.split("data");
        String data = parts[parts.length - 1];
        data = data.substring(2, data.length()-1);

        parsedRequest.getData().setData(data);

        mainRouter.handle(parsedRequest);
        return "test";
    }
}
