package Chapter5;

import javax.swing.*;

public class DiamondMod {
    public static void main(String[] args) {
        String asterisk = "";
        String asterisk2 = "";
        int numberOfAsterisks = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        for(int row = 1; row <= numberOfAsterisks; row++){
            for(int col = 1; col <= row; col++){
                asterisk += "*";
            }
            asterisk = asterisk + "\n";
        }
        System.out.print(asterisk);

        for(int row2 = numberOfAsterisks; row2 >= 1; row2--){
            for(int col2 = 1; col2 <= row2; col2++){
                asterisk2 += "*";
            }
            asterisk2 = asterisk2 + "\n";
        }
        System.out.print(asterisk2);
    }
}
