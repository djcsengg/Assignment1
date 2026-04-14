import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class subtractorTest {
    private Subtractor subtractor = new Subtractor();
    
    @Test
    public void testPositiveNumbers() {
        assertEquals(7, subtractor.subtract(10, 3));
    }
    
    @Test
    public void testNegativeResult() {
        assertEquals(-5, subtractor.subtract(3, 8));
    }
    
    @Test
    public void testZero() {
        assertEquals(0, subtractor.subtract(5, 5));
    }
    
    @Test
    public void testNegativeNumbers() {
        assertEquals(-3, subtractor.subtract(-5, -2));
    }
}
