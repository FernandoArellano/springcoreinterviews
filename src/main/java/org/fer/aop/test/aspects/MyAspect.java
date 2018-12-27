package org.fer.aop.test.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public String get*())")
    public void log(){
        System.out.println("Logging something");
    }
}
