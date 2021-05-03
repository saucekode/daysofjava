package com;

public class Circle {
    private int radius;
    private final double piValue = 3.14;

    public void collectRadiusValue(int radius) {
        this.radius = radius;
    }

    public int getRadiusValue() {
        return radius;
    }

    private double getSquareOfRadius(){
        return Math.pow(getRadiusValue(), 2);
    }

    public double circleArea() {
        return piValue * getSquareOfRadius();
    }
}
