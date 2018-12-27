package org.fer.model;

import java.util.*;

public class Square {

    private List<Point> pointList = new ArrayList<Point>();
    private Set<Point> pointSet = new HashSet<Point>();
    private Map<Integer, Point> pointMap = new HashMap<Integer, Point>();

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public Set<Point> getPointSet() {
        return pointSet;
    }

    public void setPointSet(Set<Point> pointSet) {
        this.pointSet = pointSet;
    }

    public Map<Integer, Point> getPointMap() {
        return pointMap;
    }

    public void setPointMap(Map<Integer, Point> pointMap) {
        this.pointMap = pointMap;
    }

    @Override
    public String toString() {
        return "Square{" +
                "pointList=" + pointList +
                ", pointSet=" + pointSet +
                ", pointMap=" + pointMap +
                '}';
    }
}
