package ChapterTwo;

import java.util.Scanner;


public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double userInput = input.nextInt();
        System.out.printf("Diameter, circumference and area respectively are %.2f, %.2f and %.2f", 2 * userInput,2 * Math.PI * userInput, Math.PI * userInput * userInput);

    }
}
