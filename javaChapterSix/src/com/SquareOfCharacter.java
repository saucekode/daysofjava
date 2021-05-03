package com;

import javax.swing.*;

public class SquareOfCharacter{

    private String character;

    public void fillCharacter(int side, String character){
        character += " ";
        for(int row = 1; row <= side; row++){
            for(int column = 1; column <= side; column++){
                System.out.print(character);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        SquareOfCharacter chars = new SquareOfCharacter();
        chars.fillCharacter(Integer.parseInt(JOptionPane.showInputDialog("Enter number of sides")), JOptionPane.showInputDialog("Enter any character"));
    }
}
