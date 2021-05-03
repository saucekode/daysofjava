package exercises.HealthProfile;

import exercises.Date.Date;
import exercises.HeartRates.HeartRates;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
    HealthProfile profile;
    HeartRates user;
    Date date;
    @BeforeEach
    void setUp() {
        date = new Date(10,1,1996);
        user = new HeartRates("Daisy", "Love", date.toString());
        profile = new HealthProfile(user.getFirstName(), user.getLastName(), null, date.toString());
    }

    @AfterEach
    void tearDown() {
        profile = null;
        date = null;
        user = null;
    }

    @Test
    public void testIfGenderExists(){
        profile.setGender("girl");
        String gender = profile.getGender();
        assertEquals(null, gender);

        profile.setGender("female");
        gender = profile.getGender();
        assertEquals("female", gender);
    }

}