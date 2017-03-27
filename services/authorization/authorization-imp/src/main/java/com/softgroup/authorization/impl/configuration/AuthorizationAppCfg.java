package com.softgroup.authorization.impl.configuration;

import com.softgroup.token.impl.configuration.TokenAppCfg;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Виктор on 04.03.2017.
 */
@Configuration
@ComponentScan("com.softgroup.authorization.impl")
@Import(TokenAppCfg.class)
public class AuthorizationAppCfg {
}
