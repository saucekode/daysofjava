package ChapterTwo;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int oddOrEven = input.nextInt();

        if(oddOrEven % 2 == 0){
            System.out.println(oddOrEven + " is an even number");
        }else{
            System.out.println(oddOrEven + " is an odd number");
        }
    }
}
