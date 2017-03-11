import java.math.BigDecimal;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class DivideOperation extends BinaryOperation {

    @Override
    protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.divide(value1, BigDecimal.ROUND_CEILING);
    }

}
