import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class EliminateduplicatesTest {
    Eliminateduplicates duplicate;

    @BeforeEach
    void setUp() {
        duplicate = new Eliminateduplicates();
    }

    @AfterEach
    void tearDown() {
        duplicate = null;
    }

    @Test
    void shouldReturnAnEnteredValue(){
        duplicate.setNumbers(30);
        assertEquals(30, duplicate.getNumber());
    }

    @Test
    void shouldThrowAnExceptionIfEnteredValueIsNotBetweenTenAndHundred(){
        try{
            duplicate.setNumbers(3);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        assertThrows(IllegalArgumentException.class, () -> duplicate.setNumbers(5));
    }

    @Test
    void shouldReturnNumbersAddedIntoArray(){
        int[] expectedOutput = {10,15,16,17,18};
        for(int number = 0; number < duplicate.addNumbersToArray().length; number++){
            duplicate.setNumbers(Integer.parseInt(JOptionPane.showInputDialog("Enter number")));
            duplicate.addNumbersToArray()[number] = duplicate.getNumber();
        }
        assertArrayEquals(expectedOutput, duplicate.addNumbersToArray());
    }

    @Test
    void shouldThrowAnExceptionIfArrayContainsDuplicates(){
        for(int number = 0; number < duplicate.addNumbersToArray().length; number++){
            duplicate.setNumbers(Integer.parseInt(JOptionPane.showInputDialog("Enter number")));
            duplicate.addNumbersToArray()[number] = duplicate.getNumber();
        }
        assertThrows(IllegalArgumentException.class, () -> duplicate.checkDuplicates(duplicate.addNumbersToArray()));
    }

}