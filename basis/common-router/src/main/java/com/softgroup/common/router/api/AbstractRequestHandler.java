package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements RequestHandler {

	private Class<T> persistentClass;

	@Autowired
	private DataMapper dataMapper;

	public AbstractRequestHandler() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public abstract String getName();

	@Override
	public abstract Response<R> handle(Request<?> msg);

	//check
	public Request<T> convert(Request<?> msg){
		CommonData dataMsg = (CommonData) msg.getData();
		T data = dataMapper.mapData(dataMsg.getJsonData(), persistentClass);

		Request<T> request = new Request<>();
		request.setHeader(msg.getHeader());
		request.setRoutedData(msg.getRoutedData());
		request.setData(data);
		return request;
	}
}