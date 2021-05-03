package Chapter5;

public class Diamond {
    public static void main(String[] args) {
        String asterisk = "";
        String asterisk2 = "";

        for(int row = 1; row <= 9; row++){
            if(row % 2 == 1){
                for(int col = 1; col <= row; col++){
                    asterisk += "*";
                }
            }
            asterisk = asterisk + "\n";
        }
        System.out.println(asterisk);

        for(int row2 = 7; row2 >= 1; row2--){
            if(row2 % 2 == 1){
                for(int col2 = 1; col2 <= row2; col2++){
                    asterisk2 += "*";
                }
            }
            asterisk2 = asterisk2 + "\n";
        }
        System.out.println(asterisk2);
    }
}
