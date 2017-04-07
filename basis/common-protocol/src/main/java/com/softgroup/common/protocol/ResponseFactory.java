package com.softgroup.common.protocol;

/**
 * Created by Виктор on 07.04.2017.
 */
public class ResponseFactory<T extends ResponseData> {

    public Response<T> createResponse(Request<?> msg, T data, ResponseStatus status){
        Response<T> response = new Response<>();
        response.setHeader(msg.getHeader());
        response.setData(data);
        response.setStatus(status);
        return response;
    }

    public Response<T> createResponse(Request<?> msg, ResponseStatus status){
        return createResponse(msg, null, status);
    }
}
