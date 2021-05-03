package com;

public class Multiples {
    private int firstNum;
    private int secondNum;

    public void setTwoIntegers(int firstNumber, int secondNumber) {
        firstNum = firstNumber;
        secondNum = secondNumber;
    }

    private boolean checkIfSecondIsMultipleOfFirst() {
        return (secondNum % firstNum == 0);
    }

    public boolean isMultipleOfFirst() {
        return checkIfSecondIsMultipleOfFirst();
    }
}
