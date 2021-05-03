import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnedimensionalTest {
    Onedimensional array;

    @BeforeEach
    void setUp(){
        array = new Onedimensional();
    }

    @AfterEach
    void tearDown(){
        array = null;
    }

    @Test
    void shouldReturnArrayOfZeroes(){
        array.setArrayOfZeroes(0);
        int[] expectedArray = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(expectedArray, array.getArrayOfZeroes());
    }

    @Test
    void shouldReturnArrayOfOnes(){
        array.setArrayOfOne(1);
        int[] expectedArray = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertArrayEquals(expectedArray, array.getArrayOfOne());
    }

    @Test
    void shouldReturnFiveBestValues(){
        int[] expectedScores = {56,65,88,72,90};
        int[] scores = {45,12,56,33,65,88,72,90,75,33,12,34};
        array.setBestScores(scores);
        assertArrayEquals(expectedScores, array.getBestScores());
    }
}