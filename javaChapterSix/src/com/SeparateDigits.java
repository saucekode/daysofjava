package com;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateDigits {
    private int firstInteger;

    public void setFirstInteger(int firstInteger) throws CustomExceptions{
        if(firstInteger > 99999 || firstInteger < 1){
            throw new CustomExceptions("numberLengthExceededError\nNumber should be between 1 and 99999");
        }
        else{
            this.firstInteger = firstInteger;
        }
    }

    public int getFirstInteger() {
        return firstInteger;
    }

    private int quotient(){
        return firstInteger / 10;
    }

    private int remainder(){
        return firstInteger % 10;
    }

    private String separateDigits(){
        int count = String.valueOf(getFirstInteger()).length();
        int modulo = 0;
        String newValue = "";
        while(count > 0){
            count--;
            modulo = remainder();
            firstInteger = quotient();
            newValue += " " + modulo;
        }
        return newValue;
    }

    public String displayDigits(){
        StringBuffer string = new StringBuffer(separateDigits());
        return String.valueOf(string.reverse());
    }

    public static void main(String[] args) {
        SeparateDigits digit = new SeparateDigits();
        try{
            digit.setFirstInteger(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        }catch(CustomExceptions e){
            System.err.println(e);
        }catch(NumberFormatException e){
            System.err.println("You entered a string. Application requires a number.");
        }

        System.out.println(digit.displayDigits());
    }
}
