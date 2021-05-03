public class Eliminateduplicates {
    private int input;
    private final int[] numbers = new int[5];

    private void validateInput(int inputToValidate){
        if(inputToValidate < 10 || inputToValidate > 100){
            throw new IllegalArgumentException("Number should be in the range of 10 and 100");
        }
    }

    public void setNumbers(int input) {
        validateInput(input);
        this.input = input;
    }

    public int getNumber() {
        return input;
    }


    public void checkDuplicates(int[] arrayElements) {
        int firstElement = arrayElements[0];
        for(int element = 1; element < arrayElements.length; element++) {
            if(firstElement != arrayElements[element]){
                firstElement = arrayElements[element];
            }else{
                throw new IllegalArgumentException("Your input is repeated. Try again!");
            }
        }
    }

    public int[] addNumbersToArray() {
        return numbers;
    }
}
