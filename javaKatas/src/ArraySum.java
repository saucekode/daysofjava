import java.lang.Math;
public class ArraySum {

    public int calculateSum(int[] studentScoresArray) {
        int total = 0;
        for(int i = 0; i < studentScoresArray.length; i++){
            total += studentScoresArray[i];
        }
       return total;
    }

    public double calculateScoresAverage(int[] studentScoresArray) {
        return (calculateSum(studentScoresArray)/(studentScoresArray.length * 1.0));
    }

    public int getMaximum(int[] studentsScoresArray) {
        int maximum = studentsScoresArray[0];
        for(int i = 0; i < studentsScoresArray.length; i++){
            if(maximum < studentsScoresArray[i]){
                maximum = studentsScoresArray[i];
            }
        }
        return maximum;
    }

    public int getMinimum(int[] studentsScoresArray) {
        int minimum = studentsScoresArray[0];
        for(int i = 0; i < studentsScoresArray.length; i++){
            if(minimum > studentsScoresArray[i]){
                minimum = studentsScoresArray[i];
            }
        }
        return minimum;
    }
}
