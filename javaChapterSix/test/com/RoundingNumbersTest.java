package com;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {
    @Test
    void testThatInputCanBeCollected(){
        assertEquals(76.5, RoundingNumbers.collectNumberToRound(76.5));
    }

    @Test
    void testThat_InputCanBeRounded(){
        assertEquals(78.0, RoundingNumbers.roundNumber(77.9));
    }
}