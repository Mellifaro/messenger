package com.softgroup.rest.impl.mvcConfig;

/**
 * Created by Виктор on 27.03.2017.
 */
import com.softgroup.authorization.impl.configuration.AuthorizationAppCfg;
import com.softgroup.common.dao.impl.configuration.CommonDaoAppCfg;
import com.softgroup.common.datamapper.configuration.DataMapperAppCfg;
import com.softgroup.mainrouter.imp.configuration.MainRouterAppCfg;
import com.softgroup.rest.impl.securityConfig.AppSecurityConfig;
import com.softgroup.token.impl.configuration.TokenAppCfg;
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
        DataMapperAppCfg.class,
        TokenAppCfg.class,
        CommonDaoAppCfg.class
})
public class WebConfig {
}