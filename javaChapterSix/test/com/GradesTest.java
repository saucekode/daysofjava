package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {
    @Test
    void testScoresInputAreCorrect(){
        Grades studentGrade = new Grades();
        studentGrade.collectScore(34);
        assertEquals(34, studentGrade.getScore());
    }

    @Test
    void testScoresForRightGrade(){
        Grades studentGrade = new Grades();
        studentGrade.collectScore(34);
        assertEquals(0, studentGrade.qualityPoints());
    }
}