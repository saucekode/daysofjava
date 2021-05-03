package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDiaryEntryIsSet(){
        //given
        Diary myDiary = new Diary(5);
        //when
        int numberOfDiaryEntries = myDiary.getNumberOfDiaryEntries();
        //assert
        assertEquals(5,numberOfDiaryEntries);
    }

    @Test
    void testDiaryEntryIsNotNull(){
        //given
        Diary myDiary;
        //when
        myDiary = new Diary(10);
        //assert
        Entry[] entries = myDiary.getEntries();
        assertNotNull(entries.toString());
    }

    @Test
    void testDiaryEntryCanBeEntered(){
        String newStuff = "";
        //given
        Diary myDiary = new Diary(3);
        Entry newEntry = new Entry("My semicolon story");
        //when
        newEntry.setEntryBody("Skeptical story");
        myDiary.addNewEntry(newEntry);
        //assert
        assertEquals(newEntry, myDiary.getEntries()[0]);

        newEntry = new Entry("My next success story");
        //when
        newEntry.setEntryBody("Nice one");
        myDiary.addNewEntry(newEntry);
        //assert
        assertEquals(newEntry, myDiary.getEntries()[1]);

        newEntry = new Entry("Money bag");
        //when
        newEntry.setEntryBody("I am a millionaire!!!");
        myDiary.addNewEntry(newEntry);
        //assert
        assertEquals(newEntry, myDiary.getEntries()[2]);

        for(int i = 0; i < myDiary.getEntries().length; i++){
            newStuff += myDiary.getEntries()[i] + "\n" + "\n";
        }

        System.out.println(newStuff);

    }

}