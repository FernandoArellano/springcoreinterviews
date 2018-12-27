package org.fer.model;

public class Circle {

    Point zeroPoint;

    public Point getZeroPoint() {
        return zeroPoint;
    }

    public void setZeroPoint(Point zeroPoint) {
        this.zeroPoint = zeroPoint;
    }

    public void myInit(){
        System.out.println("My init method circle");
    }

    public void myDestroy(){
        System.out.println("My destroy circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "zeroPoint=" + zeroPoint +
                '}';
    }
}
