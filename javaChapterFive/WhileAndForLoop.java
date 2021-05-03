package Chapter5;

public class WhileAndForLoop {
    public static void main(String[] args) {
        int i;
        // using a while loop
        i = 0;
        while(i < 20){
            i++;
            System.out.print(i);
            System.out.print("\t");
            if(i % 5 == 0){
                System.out.println();
            }
        }

        System.out.println();

        // using a for loop
        for(i = 1; i <= 20; i++){
            System.out.print(i);
            System.out.print("\t");
            if(i % 5 == 0){
                System.out.println();
            }

        }
    }
}
