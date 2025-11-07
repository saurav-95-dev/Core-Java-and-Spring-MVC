import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    @Test
    void testAddNumbers() {
        // Step 1: Create an object of the class we want to test
        Hello h = new Hello();

        // Step 2: Call the method we want to test
        int result = h.addNumbers(2, 3);

        // Step 3: Check if the result is correct
        assertEquals(5, result, "The addition should return the correct sum");
    }
}
