package org.fer;

import org.fer.model.Circle;
import org.fer.model.Square;
import org.fer.model.Star;
import org.fer.model.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMain {

    public static void main(String [] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        Triangle triangle = (Triangle)context.getBean("triangle");
        System.out.println(triangle);

        Circle circle = (Circle) context.getBean("circle");
        System.out.println(circle);

        Square square = (Square) context.getBean("square");
        System.out.println(square);

        Triangle anotherTriangle = (Triangle)context.getBean("anotherTriangle");
        System.out.println("another triangle" +triangle);

        Triangle childTriangle = (Triangle)context.getBean("childTriangle");
        System.out.println("childTriangle " +childTriangle );

        Star star= (Star)context.getBean("star");
        System.out.println("star " +star );

    }
}
