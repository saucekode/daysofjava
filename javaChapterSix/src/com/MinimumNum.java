package com;

import javax.swing.*;

public class MinimumNum {
   public double minimum3(double num1, double num2, double num3){
       return Math.min(Math.min(num1, num2), num3);
   }

    public static void main(String[] args) {
        MinimumNum min = new MinimumNum();
        System.out.println(min.minimum3(
                Double.parseDouble(JOptionPane.showInputDialog("Enter first number")),
                Double.parseDouble(JOptionPane.showInputDialog("Enter second number")),
                Double.parseDouble(JOptionPane.showInputDialog("Enter third number"))
        ));
    }
}
