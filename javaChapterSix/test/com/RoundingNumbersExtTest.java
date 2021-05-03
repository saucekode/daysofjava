package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersExtTest {
    @Test
    void testNumberCanBeRoundedToInteger(){
        assertEquals(5, RoundingNumbersExt.roundToInteger(5.67));
    }

    @Test
    void testNumberCanBeRoundedToTenths(){
        assertEquals(1.2, RoundingNumbersExt.roundToTenths(1.234));
    }

    @Test
    void testNumberCanBeRoundedToHundredths(){
        assertEquals(45.56, RoundingNumbersExt.roundToHundredth(45.56));
    }

    @Test
    void testNumberCanBeRoundedToThousandths(){
        assertEquals(45.556, RoundingNumbersExt.roundToThousandth(45.556));
    }
}