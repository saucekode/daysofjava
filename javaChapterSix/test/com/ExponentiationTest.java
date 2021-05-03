package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {
    @Test
    void testIntegerPowerMethod(){
        Exponentiation exponent = new Exponentiation();
        assertEquals(243, exponent.integerPower(3,5));
    }
}