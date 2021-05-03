package ChapterTwo;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstInput = input.nextInt();

        System.out.println("Enter second number:");
        int secondInput = input.nextInt();

        System.out.println("Enter third number:");
        int thirdInput = input.nextInt();

        System.out.println("Enter fourth number:");
        int fourthInput = input.nextInt();

        System.out.println("Enter fifth number:");
        int fifthInput = input.nextInt();

        if(firstInput > 0){
            positives++;
        }else if(firstInput < 0){
            negatives++;
        }else if(firstInput == 0){
            zeroes++;
        }

        if(secondInput > 0){
            positives++;
        }else if(secondInput < 0){
            negatives++;
        }else if(secondInput == 0){
            zeroes++;
        }

        if(thirdInput > 0){
            positives++;
        }else if(thirdInput < 0){
            negatives++;
        }else if(thirdInput == 0){
            zeroes++;
        }

        if(fourthInput > 0){
            positives++;
        }else if(fourthInput < 0){
            negatives++;
        }else if(fourthInput == 0){
            zeroes++;
        }

        if(fifthInput > 0){
            positives++;
        }else if(fifthInput < 0){
            negatives++;
        }else if(fifthInput == 0){
            zeroes++;
        }

        System.out.println("Number of positive numbers is: " + positives);
        System.out.println("Number of negative numbers is: " + negatives);
        System.out.println("Number of zero numbers is: " + zeroes);
    }
}
