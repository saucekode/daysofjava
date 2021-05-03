package com;

public class TemperatureConversions {
    private int userInput;

    public void collectUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return userInput;
    }

    public int celsius(int fahrenheit) {
        return (int)(5.0 / 9.0 * (fahrenheit - 32));
    }

    public int fahrenheit(int celsius) {
        return (int)(5.0 / 9.0 * (celsius + 32));
    }
}
