import java.math.BigDecimal;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class MultiplyOperation extends BinaryOperation {

    @Override
    protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

}
