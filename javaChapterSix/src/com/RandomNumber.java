package com;

import javax.swing.*;

public class RandomNumber {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Enter a minimum for random numbers"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Enter a maximum for random numbers"));

        int randomNumber = (int)(Math.random()*(max - min + 1) + min);

        System.out.println(randomNumber);
    }
}
