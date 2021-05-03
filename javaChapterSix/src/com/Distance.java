package com;

public class Distance {
    private int coordX1;
    private int coordY1;
    private int coordX2;
    private int coordY2;

    public void setFirstCoordinate(int x1, int y1) {
        coordX1 = x1;
        coordY1 = y1;
    }

    public void setSecondCoordinate(int x2, int y2) {
        coordX2 = x2;
        coordY2 = y2;
    }

    private String viewFirstCoords() {
        return "" + coordX1 + "," + coordY1;
    }

    private String viewSecondCoords() {
        return "" + coordX2 + "," + coordY2;
    }

    public String printFirstCoordinates(){
        return viewFirstCoords();
    }

    public String printSecondCoordinates(){
        return viewSecondCoords();
    }

    public double getCoordXDifference() {
        return coordX1 - coordX2;
    }

    public double getCoordYDifference() {
        return coordY1 - coordY2;
    }

    public double squareOfCoordXDifference() {
        return Math.pow(getCoordXDifference(), 2);
    }

    public double squareOfCoordYDifference() {
        return Math.pow(getCoordYDifference(), 2);
    }

    public double sumOfSquaresOfCoordinates() {
        return squareOfCoordXDifference() + squareOfCoordYDifference();
    }

    public double distance() {
        return Math.sqrt(sumOfSquaresOfCoordinates());
    }
}
