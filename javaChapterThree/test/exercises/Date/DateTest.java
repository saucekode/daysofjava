package exercises.Date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    void testDateArgsConstructorIsNotNull(){
        Date date = new Date(2,3,2012);
        assertNotNull(date);
    }

    @Test
    void testDayMonthAndYearCanBeUpdated(){
        Date date = new Date(2,3,2012);
        date.setDay(3);
        assertEquals(3, date.getDay());

        date.setMonth(12);
        assertEquals(12, date.getMonth());

        date.setYear(2012);
        assertEquals(2012, date.getYear());
    }

    @Test
    void testDayMonthAndYearIsNotInvalid(){
        Date date = new Date(2,3,2012);
        Exception exception;
        exception = assertThrows(IllegalArgumentException.class, () ->{
            date.setDay(32);
        });
        assertEquals("Invalid day of the month", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->{
            date.setMonth(22);
        });
        assertEquals("Month does not exist", exception.getMessage());

    }
}