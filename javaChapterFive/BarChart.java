package Chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String asterisk = "";

       for(int row = 1; row <= 5; row++){
           System.out.println("Enter a number between 1 and 30:");
            int inputs = userInput.nextInt();
            if(inputs > 30){
                System.out.println("Invalid number");
                return;
            }
            for(int column = 1; column <= inputs; column++){
                asterisk = asterisk + "*";
            }

           asterisk = asterisk + "\n";
       }
        System.out.println(asterisk);
    }
}
