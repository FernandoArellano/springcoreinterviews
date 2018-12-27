package org.fer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Diamond {


    private Point diamondPoint;

    public Point getDiamondPoint() {
        return diamondPoint;
    }

    @Autowired
    public void setDiamondPoint(Point diamondPoint) {
        this.diamondPoint = diamondPoint;
    }


    @PostConstruct
    public void postConstructmethod(){
        System.out.println("PostConstruct Diamond");

    }

    @PreDestroy
    public void prekillMethod(){
        System.out.println("PreDestroy Diamond");
    }
}
