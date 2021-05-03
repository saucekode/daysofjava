package Chapter5;

public class Factorials {

    public long generateFactorial(int expectedNumber){
        int counter = expectedNumber;
        long factorial = 1;
        while(counter > 0){
            factorial *= counter;
            counter--;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Factorials number = new Factorials();
        System.out.printf("%s%12s%n", "Number", "Factorial");
        System.out.println("------------------");
        for(int count = 1; count <= 20; count++){
            System.out.printf("%3d%4s%3s%-8d%n", count, "|", " ", number.generateFactorial(count));
        }
        System.out.println("------------------------------");
    }
}
