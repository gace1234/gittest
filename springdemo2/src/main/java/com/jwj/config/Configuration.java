package com.jwj.config;

import com.jwj.pojo.User;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public User getUser() {
        return new User("bean", "bean");
    }


}
