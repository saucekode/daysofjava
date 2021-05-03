package com;

public class Grades {
    private int score;
    private int grade;

    public void collectScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    private int getGrade() {
        switch (getScore() / 10) {
            case 9, 10 -> grade = 4;
            case 8 -> grade = 3;
            case 7 -> grade = 2;
            case 6 -> grade = 1;
            default -> grade = 0;
        }
        return grade;
    }

    public int qualityPoints(){
       return  getGrade();
    }
}
