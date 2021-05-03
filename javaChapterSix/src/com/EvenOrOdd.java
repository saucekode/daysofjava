package com;

import javax.swing.*;

public class EvenOrOdd {
    private int theInteger;

    public void setTheInteger(int theInteger) {
        this.theInteger = theInteger;
    }

    private boolean checkIfIntegerIsEvenOrOdd() {
        return (theInteger % 2 == 0);
    }

    public boolean isEvenOrOdd() {
       return checkIfIntegerIsEvenOrOdd();
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        int counter = 0;
        int seriesOfNumbers = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        while(counter < 10){
            seriesOfNumbers = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            counter++;
            evenOrOdd.setTheInteger(seriesOfNumbers);
            System.out.println(evenOrOdd.isEvenOrOdd());
        }
    }
}
