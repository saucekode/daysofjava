package com;

import javax.swing.*;

public class PerfectNumber {
    private int anyNumber;
    private boolean isPerfectNumber;

    public void collectAnyNumber(int anyNumber){
        this.anyNumber = anyNumber;
    }

    public int getProvidedNumber(){
        return anyNumber;
    }

    private boolean calculateForPerfectNumber(){
        int count = 1;
        int total = 0;
        while(count < getProvidedNumber()){
            if(getProvidedNumber() % count == 0){
                total += count;
                System.out.print(count + " ");
            }
            if(total == getProvidedNumber()){
                isPerfectNumber = true;
            }
            count++;
        }
        System.out.println();
        return isPerfectNumber;
    }

    public boolean isPerfectNumber(){
        return calculateForPerfectNumber();
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.collectAnyNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter any number between 1 and 1000")));
        if(perfectNumber.isPerfectNumber()){
            System.out.println("This is a perfect number!!!");
        }else{
            System.out.println("This is not a perfect number, duh!");
        }
    }
}
