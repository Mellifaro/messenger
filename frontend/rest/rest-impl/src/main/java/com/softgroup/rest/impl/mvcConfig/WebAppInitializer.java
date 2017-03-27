package com.softgroup.rest.impl.mvcConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Виктор on 20.03.2017.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    public Class<?>[] getRootConfigClasses() {
//        return new Class<?>[]{RestApplicationConfiguration.class};
        return null;
    }

    @Override
    public Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

}