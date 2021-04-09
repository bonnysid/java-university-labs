package com.bonnysid.labs.labs;

import com.bonnysid.labs.labs.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.bonnysid.labs.labs")
public class Config {

    @Bean
    @Scope(scopeName = "prototype")
    public Student student() {
        return new Student();
    }

}
