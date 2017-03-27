package com.softgroup.rest.impl.mvcConfig;

import com.softgroup.authorization.impl.configuration.AuthorizationAppCfg;
import com.softgroup.common.datamapper.configuration.DataMapperAppCfg;
import com.softgroup.mainrouter.imp.configuration.MainRouterAppCfg;
import com.softgroup.rest.impl.securityConfig.AppSecurityConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Виктор on 20.03.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.softgroup.rest.impl"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
@Import({
        AppSecurityConfig.class,
        MainRouterAppCfg.class,
        AuthorizationAppCfg.class,
        DataMapperAppCfg.class
})
public class WebConfig {
}
