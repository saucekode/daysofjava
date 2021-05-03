package ChapterTwo;

import java.util.Scanner;

public class SeparateDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(!(number < 10000) && !(number > 99999)){
            int fifthModulo = number%10;

            int fifthValue = number/10;
            int fourthModulo = fifthValue%10;

            number = fifthValue;

            int fourthValue = number/10;
            int thirdModulo = fourthValue%10;

            number = fourthValue;

            int thirdValue = number/10;
            int secondModulo = thirdValue%10;

            number = thirdValue;

            int secondValue = number/10;
            int firstModulo = secondValue%10;

            System.out.println(firstModulo + "   " + secondModulo + "   " + thirdModulo + "   " + fourthModulo + "   " + fifthModulo);

        }
    }
}
