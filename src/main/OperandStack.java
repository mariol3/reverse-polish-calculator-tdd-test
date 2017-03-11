import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class OperandStack {

    private Stack<BigDecimal> values = new Stack<>();

    public BigDecimal peek() {
        return values.size() == 0 ? BigDecimal.ZERO : values.peek();
    }

    public void push(BigDecimal value) {
        values.push(value);
    }

    public void replaceTop(BigDecimal value) {
        this.pop();
        values.push(value);
    }

    public void pop() {
        if (values.size() > 0) {
            values.pop();
        }
    }

}
