package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    @Test
    void testIfSecondArgumentIsMultipleOfFirstArgument(){
        Multiples multiple = new Multiples();
        multiple.setTwoIntegers(2,10);
        assertTrue(multiple.isMultipleOfFirst());
    }
}