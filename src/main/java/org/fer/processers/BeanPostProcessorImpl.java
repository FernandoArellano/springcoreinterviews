package org.fer.processers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("Bean PP AFTER Impl: " + beanName);
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean PP Before Impl: " + beanName);
        return bean;
    }
}
