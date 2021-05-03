package com;

public class Hypotenuse {

    private double sideOfTriangle;

    public void collectTriangleSideSquare(double sideOfTriangle) {
        this.sideOfTriangle = sideOfTriangle;
    }

    public double calculateSquareOfSide(){
        return Math.pow(sideOfTriangle, 2);
    }

    public double sumOfTriangleSides(double firstSide, double secondSide) {
        return firstSide + secondSide;
    }

    public double valueOfHypotenuse(double hypotenuse){
        return Math.sqrt(hypotenuse);
    }
}
