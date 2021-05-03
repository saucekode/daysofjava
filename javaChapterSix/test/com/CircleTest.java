package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testForRadiusValueGottenFromUser(){
        Circle area = new Circle();
        area.collectRadiusValue(3);
        assertEquals(3, area.getRadiusValue());
    }

    @Test
    void testForAreaOfCircle(){
        Circle area = new Circle();
        area.collectRadiusValue(4);
        assertEquals(50.24, area.circleArea());
    }
}