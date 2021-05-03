package com;

import javax.swing.*;

public class Asterisks {
    private String asterisk;

    public void squareOfAsterisks(int side){
        asterisk = "* ";
        for(int row = 1; row <= side; row++){
            for(int column = 1; column <= side; column++){
                System.out.print(asterisk);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Asterisks asterisk = new Asterisks();
        asterisk.squareOfAsterisks(Integer.parseInt(JOptionPane.showInputDialog("Enter number of sides")));
    }

}
