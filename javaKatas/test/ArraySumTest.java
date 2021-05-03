import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    ArraySum arraySum;
    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }

    @AfterEach
    void tearDown() {
        arraySum = null;
    }

    @Test
    void testArrayCanCalculateSum(){
        arraySum = new ArraySum();
        int[] studentScoresArray = {1,2,4,5,8,9};
        assertEquals(29, arraySum.calculateSum(studentScoresArray));
    }

    @Test
    void testArrayCanCalculateAverage(){
        arraySum = new ArraySum();
        int[] studentsScoresArray = {3,6,1,3};
        assertEquals(3.25, arraySum.calculateScoresAverage(studentsScoresArray));
    }

    @Test
    void testArrayOutputsMaximumValue(){
        arraySum = new ArraySum();
        int[] studentsScoresArray = {3,6,1,2};
        assertEquals(6, arraySum.getMaximum(studentsScoresArray));
    }

    @Test
    void testArrayOutputsMinimumValue(){
        arraySum = new ArraySum();
        int[] studentsScoresArray = {3,6,1,3};
        assertEquals(1, arraySum.getMinimum(studentsScoresArray));
    }

}