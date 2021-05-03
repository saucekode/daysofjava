package com;

import javax.swing.*;

public class RoundingNumbers {

    public static double collectNumberToRound(double numberToRound) {
        return numberToRound;
    }

    public static double roundNumber(double numberToBeRounded) {
        return Math.round(numberToBeRounded);
    }

    public static void main(String[] args) {
        double numberToRound = collectNumberToRound(Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number")));
        System.out.println("Original Number: " + numberToRound);

        double roundedNumber = roundNumber(numberToRound);
        System.out.println("Rounded value of number: " + roundedNumber);
    }


}
