import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class CalculatorWithThreeValuesTest {

    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;

    @Before
    public void createCalculator() {
        calculator = new Calculator();

        value1 = new BigDecimal(10);
        value2 = new BigDecimal(20);
        value3 = new BigDecimal(30);

        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
        calculator.enter();
        calculator.setAccumulator(value3);
    }

    @Test
    public void testAccumulatorAfterPushingThreeValues() throws Exception {
        assertEquals(value3, calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorAfterSingleDrop() throws Exception {
        calculator.drop();
        assertEquals(value2, calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorAfterDroppingTwice() throws Exception {
        calculator.drop();
        calculator.drop();
        assertEquals(value1, calculator.getAccumulator());
    }

}
