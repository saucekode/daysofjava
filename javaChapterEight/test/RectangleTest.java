import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle();
    }

    @AfterEach
    void tearDown() {
        rectangle = null;
    }

    @Test
    void shouldReturnLengthOfTriangle(){
        rectangle.setLength(15);
        assertEquals(15, rectangle.getLength());
    }

    @Test
    void shouldThrowAnExceptionIfLengthExceedsLimit(){
        try{
            rectangle.setLength(-3);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(-1));
        assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(30));
    }

    @Test
    void shouldReturnWidthOfTriangle(){
        rectangle.setWidth(20);
        assertEquals(20, rectangle.getWidth());
    }

    @Test
    void shouldThrowAnExceptionIfWidthExceedsLimit(){
        try{
            rectangle.setWidth(-3);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(-1));
        assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(25));
    }

    @Test
    void shouldReturnPerimeterOfRectangle(){
        rectangle.setWidth(15);
        rectangle.setLength(5);
        assertEquals(40, rectangle.getPerimeter());
    }

    @Test
    void shouldReturnAreaOfRectangle(){
        rectangle.setWidth(15);
        rectangle.setLength(5);
        assertEquals(75, rectangle.getArea());
    }
}