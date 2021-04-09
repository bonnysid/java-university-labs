package com.bonnysid.labs.labs;

import com.bonnysid.labs.labs.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Context {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.bonnysid.labs.labs");

        System.out.println(context.getBean("student", Student.class));

    }
}
