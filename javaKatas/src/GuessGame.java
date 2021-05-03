import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private int userValue;

    public static int generateRandomNumbers(){
        int generator = randomNumbers.nextInt(50);
        return generator;
    }

    public int getRandomNumbers(){
        return generateRandomNumbers();
    }

    public void setUserValue(int userValue){
        this.userValue = userValue;
    }

    public int getUserValue(){
        return userValue;
    }

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Guess a number between 1 to 50");
            int values = input.nextInt();
            if(values > guessGame.getRandomNumbers()){
                System.out.println("Too high. Try Again");
            }else if(values < guessGame.getRandomNumbers()){
                System.out.println("Too low. Try Again");
            }else{
                System.out.println("Congratulations! You guessed correct!");
            }
        }
    }
}

//Method that can sum up values in an array
