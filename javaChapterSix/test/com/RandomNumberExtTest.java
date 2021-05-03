package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberExtTest {
    @Test
    void testRandomNumbers_ForNumberswithDifferenceOfTwo(){
        RandomNumberExt randomNumberExt = new RandomNumberExt();
        assertNotNull(randomNumberExt.getRandNumber(2,10));
    }
}