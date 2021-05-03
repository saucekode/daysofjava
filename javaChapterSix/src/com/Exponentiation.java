package com;

public class Exponentiation {

    public int integerPower(int base, int exponent) {
        int counter = 1;
        int product = 1;
        while(counter <= exponent){
            product *= base;
            counter++;
        }
        return product;
    }
}
