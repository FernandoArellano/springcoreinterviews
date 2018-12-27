package org.fer.model;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Star {

    @Resource(name = "greaterPoint")
    private Point starPoint;

    public Point getStarPoint() {
        return starPoint;
    }

    public void setStarPoint(Point starPoint) {
        this.starPoint = starPoint;
    }

    @Override
    public String toString() {
        return "Star{" +
                "starPoint=" + starPoint +
                '}';
    }
}
