package com.bonnysid.labs.labs;

import com.bonnysid.labs.labs.annotation.DefaultName;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StudentPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Arrays.stream(bean.getClass().getDeclaredFields())
                .filter(field -> field.getAnnotation(DefaultName.class) != null)
                .forEach(field -> {
                    try {
                        field.setAccessible(true);
                        String name = (String) field.get(bean);
                        String defaultName = field.getAnnotation(DefaultName.class).name();
                        if(name == null) field.set(bean, defaultName);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return bean;
    }
}
