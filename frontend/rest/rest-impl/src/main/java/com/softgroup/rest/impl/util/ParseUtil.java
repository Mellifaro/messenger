package com.softgroup.rest.impl.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RoutedData;
import com.softgroup.rest.impl.CommonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by Виктор on 27.03.2017.
 */
@Component
public class ParseUtil {

    @Autowired
    private DataMapper dataMapper;

    public Request<CommonData> parseHttpRequest(HttpServletRequest request, HttpSession session) throws IOException{
        String test = "";
        //Receiving post body
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            test = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        }
        Request<CommonData> parsedRequest = dataMapper.mapData(test, new TypeReference<Request<CommonData>>() {});

        RoutedData routedData = new RoutedData();
        routedData.setUserId((String) session.getAttribute("userId"));
        //routedData.setSessionUUID(session.getId());

        parsedRequest.setRoutedData(routedData);

        //receiving data and writing it to string
        String[] parts = test.split("data");
        String data = parts[parts.length - 1];
        data = data.substring(2, data.length()-1);
        parsedRequest.setData(new CommonData(data));
        return parsedRequest;
    }
}
