package exercises.HeartRates;
import exercises.Date.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {
    HeartRates user;
    Date date;
    @BeforeEach
    void setUp() {
        date = new Date(12,3,2011);
        user = new HeartRates("Amaka", "Mbah", date.toString());
    }

    @AfterEach
    void tearDown() {
        user = null;
        date = null;
    }

    @Test
    public void testIfFirstNameExists(){
        user.setFirstName("Grace");
        String name = user.getFirstName();
        assertEquals("Grace", name);
    }

    @Test
    public void testIfLastNameExists(){
        user.setLastName("Billard");
        String name = user.getLastName();
        assertEquals("Billard", name);
    }

    @Test
    public void testCalculationOfAgeInYears(){
        user.calculateAgeInYears(1985);
        int userAge = user.getAge();
        assertEquals(35, userAge);

        user.calculateAgeInYears(1925);
        userAge = user.getAge();
        assertEquals(95, userAge);
    }

    @Test
    public void testAgeIsNotNegativeOrZero(){
        user.calculateAgeInYears(2030);
        int userAge = user.getAge();
        assertEquals(0, userAge);

        user.calculateAgeInYears(2020);
        userAge = user.getAge();
        assertEquals(0, userAge);
    }

    @Test
    public void testCalculateMaximumHeartRate(){
        user.calculateMaximumHeartRate(35);
        int userMaximumHeartRate = user.getMaximumHeartRate();
        assertEquals(185, userMaximumHeartRate);

        user.calculateMaximumHeartRate(45);
        userMaximumHeartRate = user.getMaximumHeartRate();
        assertEquals(175, userMaximumHeartRate);

    }

    @Test
    public void testCalculateTargetHeartRate(){
        user.setTargetHeartRate(55, 175);
        int userTargetHeartRate = user.getTargetHeartRate();
        assertEquals(96, userTargetHeartRate);
    }

}