package org.fer.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Hexagone implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {

    Point x;

    public void destroy() throws Exception {
        System.out.println("Hexagone, disposable bean destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Hexagone, initializeing bean afterpropertiesSet");
    }

    public void setBeanName(String s) {
        System.out.println("seat Bean Name: " +s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Circle circle = (Circle)applicationContext.getBean("circle");
        System.out.println("Circle from application context: " + circle);

    }



    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }



}
