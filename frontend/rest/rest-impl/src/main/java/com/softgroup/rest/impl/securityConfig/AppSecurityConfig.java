package com.softgroup.rest.impl.securityConfig;

import com.softgroup.rest.impl.util.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by Виктор on 20.03.2017.
 */

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
//
//    @Autowired
//    private RestAuthenticationSuccessHandler restAuthenticationSuccessHandler;
//
    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @Autowired
//    private JwtAuthenticationProvider jwtAuthenticationProvider;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(restAuthenticationEntryPoint)
//                .and()
                .authorizeRequests()
                    .antMatchers("/register").permitAll()
                    .antMatchers("/sms_confirm").permitAll()
                    .antMatchers("/**").authenticated()
                    .and();



        //adding custom filter
        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

//        http.antMatcher("/register").antMatcher("/sms_confirm").securityContext().disable();

    }

//    @Bean
//    public RestAuthenticationSuccessHandler mySuccessHandler(){
//        return new RestAuthenticationSuccessHandler();
//    }
//    @Bean
//    public SimpleUrlAuthenticationFailureHandler myFailureHandler(){
//        return new SimpleUrlAuthenticationFailureHandler();
//    }
//
//    @Override
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
}

