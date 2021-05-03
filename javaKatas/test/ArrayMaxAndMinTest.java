import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxAndMinTest {
    ArrayMaxAndMin arrayMaxAndMin;
    @BeforeEach
    void setUp() {
        arrayMaxAndMin = new ArrayMaxAndMin();
    }

    @AfterEach
    void tearDown() {
        arrayMaxAndMin = null;
    }

    @Test
    void testArrayOutputsMaximumValueByAddition(){
        arrayMaxAndMin = new ArrayMaxAndMin();
        int[] studentsScoresArray = {3,6,1,3};
        assertEquals(12,arrayMaxAndMin.getMaximum(studentsScoresArray));
    }

    @Test
    void testArrayOutputsMinimumValueByAddition(){
        arrayMaxAndMin = new ArrayMaxAndMin();
        int[] studentsScoresArray = {3,6,1,3};
        assertEquals(7,arrayMaxAndMin.getMinimum(studentsScoresArray));
    }
}