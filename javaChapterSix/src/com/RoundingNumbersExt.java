package com;

import javax.swing.*;

public class RoundingNumbersExt extends RoundingNumbers{

    public static double roundToInteger(double number) {
        return Math.floor(number);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10.0) / 10.0;
    }

    public static double roundToHundredth(double number) {
        return Math.floor(number * 100.0)/100.0;
    }

    public static double roundToThousandth(double number) {
        return Math.floor(number * 1000.0)/1000.0;
    }

    public static void main(String[] args) {
        double numberCollectedToInteger = collectNumberToRound(Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number")));
        System.out.println("Original Number For Integer: " + numberCollectedToInteger);

        double numberRoundedToInteger = roundToInteger(numberCollectedToInteger);
        System.out.println("Number rounded to integer: " + numberRoundedToInteger);

        double numberCollectedForTenth = collectNumberToRound(Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number")));
        System.out.println("Original Number For Tenth: " + numberCollectedForTenth);

        double numberRoundedToTenths = roundToTenths(numberCollectedForTenth);
        System.out.println("Number rounded to tenth: " + numberRoundedToTenths);

        double numberCollectedForHundredth = collectNumberToRound(Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number")));
        System.out.println("Original Number For Hundredth: " + numberCollectedForHundredth);

        double numberRoundedToHundredth = roundToHundredth(numberCollectedForHundredth);
        System.out.println("Number rounded to hundredth: " + numberRoundedToHundredth);

        double numberCollectedForThousandth = collectNumberToRound(Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number")));
        System.out.println("Original Number For thousandth: " + numberCollectedForThousandth);

        double numberRoundedToThousandth = roundToThousandth(numberCollectedForThousandth);
        System.out.println("Number rounded to thousandth: " + numberRoundedToThousandth);
    }

}
