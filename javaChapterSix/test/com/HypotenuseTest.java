package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseTest {
    @Test
    void testForSquareMethod(){
        Hypotenuse hypot = new Hypotenuse();
        hypot.collectTriangleSideSquare(3);
        assertEquals(9, hypot.calculateSquareOfSide());
    }

    @Test
    void testForSumOfSides(){
        Hypotenuse hypot = new Hypotenuse();
        hypot.collectTriangleSideSquare(5);
        double firstSide = hypot.calculateSquareOfSide();
        hypot.collectTriangleSideSquare(6);
        double secondSide = hypot.calculateSquareOfSide();
        assertEquals(61, hypot.sumOfTriangleSides(firstSide, secondSide));
    }

    @Test
    void testForHypotenuse(){
        Hypotenuse hypot = new Hypotenuse();
        hypot.collectTriangleSideSquare(5);
        double firstSide = hypot.calculateSquareOfSide();
        hypot.collectTriangleSideSquare(6);
        double secondSide = hypot.calculateSquareOfSide();
        double sumOfSides = hypot.sumOfTriangleSides(firstSide, secondSide);
        assertEquals(7.810249675906654, hypot.valueOfHypotenuse(sumOfSides));
    }


}