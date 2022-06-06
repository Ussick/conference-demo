package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Value("${USER_NAME:''}")
//    private String username;
//
//    @Value("${PASSWORD:''}")
//    private String password;
//
//
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.password(password);
//        builder.username(username);
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        System.out.println("My custom datasource bean has bean created");
//        return builder.build();
//    }
}
