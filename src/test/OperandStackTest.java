import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class OperandStackTest {

    private OperandStack stack;

    @Before
    public void createStack() {
        stack = new OperandStack();
    }

    @Test
    public void testNewOperandStackPeekReturnsZero() {
        assertEquals(BigDecimal.ZERO, stack.peek());
    }

    @Test
    public void testPushingValuesOntoStack() {
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingTopOfTheStack() {
        stack.push(new BigDecimal(12));
        BigDecimal value = new BigDecimal(23);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingTopWithEmptyStack() {
        BigDecimal value = new BigDecimal(12);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingValueFromStack() {
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        stack.push(new BigDecimal(50));
        stack.pop();
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingFromEmptyStack() {
        stack.pop();
        assertEquals(BigDecimal.ZERO, stack.peek());
    }

}
