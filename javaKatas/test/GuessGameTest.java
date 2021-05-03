import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.security.SecureRandom;
import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {
    GuessGame guessGame;

    @BeforeEach
    void setUp() {
        guessGame = new GuessGame();
    }

    @AfterEach
    void tearDown() {
        guessGame = null;
    }

    @Test
    public void testUserInputIsEqualToRandomNumber(){
        guessGame = new GuessGame();
        guessGame.setUserValue(12);
        int value = guessGame.getUserValue();
        assertEquals(guessGame.getRandomNumbers(), value);
    }


}