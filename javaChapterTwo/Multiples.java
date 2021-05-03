package ChapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstInput = input.nextInt();

        System.out.println("Enter the second number");
        int secondInput = input.nextInt();

        if(firstInput % secondInput == 0){
            int result = firstInput / secondInput;
            System.out.println(firstInput + " is a multiple of " + secondInput + " and the result is " + result);
        }else{
            System.out.println(firstInput + " is not a multiple of " + secondInput);
        }
    }
}
