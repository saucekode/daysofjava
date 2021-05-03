package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry diaryEntry;
    @BeforeEach
    void setUp() {
        diaryEntry = new Entry("My title");
    }

    @AfterEach
    void tearDown() {
        diaryEntry = null;
    }

    @Test
    void testEntryCanChangeTitle(){
        // given
        diaryEntry = new Entry("My Title");

        // when
        diaryEntry.setEntryTitle("New Entry Title");

        // assert
        String entryTitle = diaryEntry.getEntryTitle();
        assertEquals("New Entry Title", entryTitle);
    }

    @Test
    void testDateOfEntryIsCreatedAfterConstruction(){
        //given
        Entry diaryEntry;

        //when
        diaryEntry = new Entry("My title");

        //assert
        LocalDateTime entryDateTime = diaryEntry.getEntryDateAndTime();
        assertNotNull(entryDateTime);

        //assert
        LocalDate entryDate = entryDateTime.toLocalDate();

        assertEquals(LocalDate.now(), entryDate);

        System.out.println(entryDateTime.toString());
    }

    @Test
    void testEntryBodyCanBeEdited(){
        //given
        Entry newEntry = new Entry("New Entry");
        //when
        newEntry.setEntryBody("This is the entry body");
        //assert
        assertEquals("This is the entry body", newEntry.getEntryBody());
    }

    @Test
    void testViewEntry(){
        //given
        Entry entry = new Entry("My Semicolon Story");
        entry.setEntryBody("The first day I came here, I was skeptical");
        String actual = entry.viewEntry();
        String expected = ("Title: My Semicolon Story" + "\n" +
                "Entry Date: " + LocalDate.now() + "\n" +
                "Entry Body: The first day I came here, I was skeptical"
        );
        //asserts
        assertEquals(expected, actual);

        actual = entry.toString();
        assertEquals(expected, actual);
    }

}