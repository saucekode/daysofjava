import java.util.Arrays;

public class Onedimensional {
    private final int[] zeroes = new int[10];
    private final int[] bonus = new int[15];
//    private int[] scores = {45,12,56,33,65,88,72,90,75,33,12,34};
    private int[] bestScores;

    public void setArrayOfZeroes(int zeroes) {
        Arrays.fill(this.zeroes, zeroes);
    }

    public int[] getArrayOfZeroes() {
        return zeroes;
    }

    public void setArrayOfOne(int ones) {
        Arrays.fill(bonus, ones);
    }

    public int[] getArrayOfOne() {
        return bonus;
    }

    public void setBestScores(int[] score) {
        int index = 0;
        int scoreLength = 0;
        for (int i : score) {
            if (i > 50) {
                scoreLength = index++;
            }
        }

        bestScores = new int[scoreLength];

        for (int i : score) {
            if (i > 60) {
//                System.out.println(score[count]);
                bestScores[index] = i;
            }
        }
        System.out.println(Arrays.toString(bestScores));
    }

    public int[] getBestScores() {
        return bestScores;
    }
}
