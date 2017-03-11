import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class OperationsTest {

    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(45));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(95));
    }

    @Test
    public void testExecuteAdd() {
        calculator.execute(Operation.TYPE.ADD);
        assertEquals(new BigDecimal(140), calculator.getAccumulator());
    }

    @Test
    public void testExecuteSubctract() {
        calculator.execute(Operation.TYPE.SUBTRACT);
        assertEquals(new BigDecimal(-50), calculator.getAccumulator());
    }

    @Test
    public void testExecuteMultiply() {
        calculator.execute(Operation.TYPE.MULTIPLY);
        assertEquals(new BigDecimal(4275), calculator.getAccumulator());
    }

    @Test
    public void testExecuteDivide() {
        calculator.execute(Operation.TYPE.DIVIDE);
        assertEquals(new BigDecimal(1), calculator.getAccumulator());
    }

}
