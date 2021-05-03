package Chapter5;

public class Asterisk {
    public static void main(String[] args) {
        String asterisk = "";
        for (int counter = 1; counter <= 10; counter++) {
            for (int j = 1; j <= 1; j++) {
                asterisk = asterisk + "*";
            }
            System.out.println(asterisk);
        }

        for (int counter2 = 11; counter2 > 0; counter2--) {
            System.out.println();
            for (int j = 1; j < counter2; j++) {
                System.out.print("*");
            }
        }


    }
}
