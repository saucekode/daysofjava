package ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int minAndMaxNumber = userInput.nextInt();

        System.out.println("Enter the second number:");
        int secondInput = userInput.nextInt();

        System.out.println("Enter the third number:");
        int thirdInput = userInput.nextInt();

        System.out.println("Enter the fourth number:");
        int fourthInput = userInput.nextInt();

        System.out.println("Enter the fifth number:");
        int fifthInput = userInput.nextInt();
        
        if(minAndMaxNumber <= secondInput){
            minAndMaxNumber = secondInput;
        }
        if(minAndMaxNumber <= thirdInput){
            minAndMaxNumber = thirdInput;
        }
        if(minAndMaxNumber <= fourthInput){
            minAndMaxNumber = fourthInput;
        }
        if(minAndMaxNumber <= fifthInput){
            minAndMaxNumber = fifthInput;
        }

        System.out.println("Maximum number is " + minAndMaxNumber);

        if(minAndMaxNumber >= secondInput){
            minAndMaxNumber = secondInput;
        }
        if(minAndMaxNumber >= thirdInput){
            minAndMaxNumber = thirdInput;
        }
        if(minAndMaxNumber >= fourthInput){
            minAndMaxNumber = fourthInput;
        }
        if(minAndMaxNumber >= fifthInput){
            minAndMaxNumber = fifthInput;
        }
        
        System.out.println("Minimum number is " + minAndMaxNumber);

    }
}
