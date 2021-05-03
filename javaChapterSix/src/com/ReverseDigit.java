package com;

public class ReverseDigit {
    private int expectedInput;

    public void setExpectedInput(int expectedInput) {
        this.expectedInput = expectedInput;
    }

    public int getExpectedInput() {
        return expectedInput;
    }

    public String reverseDigit(){
        StringBuffer number = new StringBuffer(getExpectedInput());
        return String.valueOf(number.reverse());
    }
}
