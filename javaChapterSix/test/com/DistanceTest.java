package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {
    @Test
    void testForFirstCoordinates(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(3,4);
        assertEquals("3,4", coordinate.printFirstCoordinates());
    }

    @Test
    void testForSecondCoordinates(){
        Distance coordinate = new Distance();
        coordinate.setSecondCoordinate(5,4);
        assertEquals("5,4", coordinate.printSecondCoordinates());
    }

    @Test
    void testForDifferenceInCoordinatesX(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(4,5);
        coordinate.setSecondCoordinate(6,4);
        assertEquals(-2, coordinate.getCoordXDifference());
    }

    @Test
    void testForDifferenceInCoordinatesY(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(4,5);
        coordinate.setSecondCoordinate(6,4);
        assertEquals(1, coordinate.getCoordYDifference());
    }

    @Test
    void testForSquaresOfDifferenceOfCoordinateX(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(4,5);
        coordinate.setSecondCoordinate(6,4);
        assertEquals(4, coordinate.squareOfCoordXDifference());
    }

    @Test
    void testForSquaresOfDifferenceOfCoordinateY(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(4,5);
        coordinate.setSecondCoordinate(6,2);
        assertEquals(9, coordinate.squareOfCoordYDifference());
    }

    @Test
    void testForSumOfSquaresOfCoordinates(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(4,5);
        coordinate.setSecondCoordinate(6,2);
        assertEquals(13, coordinate.sumOfSquaresOfCoordinates());
    }

    @Test
    void testForDistance(){
        Distance coordinate = new Distance();
        coordinate.setFirstCoordinate(4,4);
        coordinate.setSecondCoordinate(6,2);
        assertEquals(2.8284271247461903, coordinate.distance());
    }
}