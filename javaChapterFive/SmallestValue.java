package Chapter5;

import javax.swing.*;

public class SmallestValue {
    private int numberOfValues;
    private int count;
    private int minimumNumber;

    public void receiveInput(int userInput) {
        numberOfValues = userInput;
    }

    public int getInput() {
        return numberOfValues;
    }

    public void setLoopAndMinimumValue() {
        int count = 1;
        int numberOfLoops = 0;
        JOptionPane.showMessageDialog(null, String.format("You will be entering numbers " + getInput() + " times"));
        int minimumNumber = Integer.parseInt(JOptionPane.showInputDialog("Number input countdown - " + count));
        for(count = count + 1; count <= numberOfValues; ++count){
            int tempNumber = Integer.parseInt(JOptionPane.showInputDialog("Number input countdown - " + count));
            if(minimumNumber > tempNumber){
                minimumNumber = tempNumber;
            }
             numberOfLoops = count;
        }

       this.count = numberOfLoops;
       this.minimumNumber = minimumNumber;
    }

    public int numberOfLoops(){
        return count;
    }

    public int getMinimumNumber() {
        return minimumNumber;
    }

    public static void main(String[] args) {
        SmallestValue minimum = new SmallestValue();

        minimum.receiveInput(Integer.parseInt(JOptionPane.showInputDialog("Enter any number to begin")));

        minimum.setLoopAndMinimumValue();

        System.out.println("Minimum number is " + minimum.getMinimumNumber());
    }
}
