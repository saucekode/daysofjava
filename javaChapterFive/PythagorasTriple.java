package Chapter5;

public class PythagorasTriple {
    public static void main(String[] args) {
        int firstSideCount = 0;
        int secondSideCount = 0;
        int hypotenuse = 0;
        int total = 1;
        int product = 1;

        while(firstSideCount <= 10){
            firstSideCount++;
//            System.out.println(firstSideCount * firstSideCount);

            if(firstSideCount == 11){
                while(secondSideCount <= 10){
                    secondSideCount++;
//                    System.out.println(secondSideCount * secondSideCount);
                    if(secondSideCount == 11){
                        while(hypotenuse <= 10){
                            hypotenuse++;
                            product = hypotenuse * hypotenuse;
//                    System.out.println(hypotenuse * hypotenuse);
                        }
                    }
                }
            }

            System.out.println();


            total = ((firstSideCount * firstSideCount) + (secondSideCount * secondSideCount));

            System.out.println(product);
          if(total == product){
//              System.out.println(true);
          }
        }
    }
}
