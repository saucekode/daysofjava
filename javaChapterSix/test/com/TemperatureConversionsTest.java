package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {
    @Test
    void testUserInputIsCorrect(){
        TemperatureConversions temp = new TemperatureConversions();
        temp.collectUserInput(23);
        assertEquals(23, temp.getUserInput());
    }

    @Test
    void testForCelsiusTemperature(){
        TemperatureConversions temp = new TemperatureConversions();
        temp.collectUserInput(56);
        int fahrenheit = temp.getUserInput();
        assertEquals(13.0, temp.celsius(fahrenheit));
    }

    @Test
    void testForFahrenheitTemperature(){
        TemperatureConversions temp = new TemperatureConversions();
        temp.collectUserInput(56);
        int celsius = temp.getUserInput();
        assertEquals(48.0, temp.fahrenheit(celsius));
    }
}