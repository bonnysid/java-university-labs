package com.bonnysid.labs.labs;

import com.bonnysid.labs.labs.model.TrafficLight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Context {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);

        TrafficLight trafficLight = context.getBean("trafficLight", TrafficLight.class);
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
    }
}
