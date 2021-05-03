package Chapter5;

public class ProductOfOdds {
    public static void main(String[] args) {
        int product = 1;
        for(int count = 1; count <= 15; count++){
            if(count % 2 == 1){
                product *= count;
            }
        }
        System.out.println("Product is " + product);
    }
}
