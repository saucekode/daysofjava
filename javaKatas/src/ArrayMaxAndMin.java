public class ArrayMaxAndMin {

    public int getMaximum(int[] studentsScoresArray) {
        int maximum = studentsScoresArray[0];
        int total = 0;
        int newMax = 0;
        for(int i = 0; i < studentsScoresArray.length; i++){
            total += studentsScoresArray[i];

            if(maximum > studentsScoresArray[i]){
                maximum = studentsScoresArray[i];
            }

            newMax = total - maximum;
        }
        return newMax;
    }

    public int getMinimum(int[] studentsScoresArray) {
        int total = 0;
        int minimum = 0;
        int newMin = 0;
        for(int i = 0; i < studentsScoresArray.length; i++){
            total += studentsScoresArray[i];

            if(minimum < studentsScoresArray[i]){
                minimum = studentsScoresArray[i];
            }
            newMin = total - minimum;
        }
        return newMin;
    }
}
