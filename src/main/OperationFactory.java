import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class OperationFactory {

    final static private Map<Operation.TYPE, Supplier<Operation>> operations = new HashMap<>();
    static {
        operations.put(Operation.TYPE.ADD, AddOperation::new);
        operations.put(Operation.TYPE.SUBTRACT, SubtractOperation::new);
        operations.put(Operation.TYPE.MULTIPLY, MultiplyOperation::new);
        operations.put(Operation.TYPE.DIVIDE, DivideOperation::new);
    }

    private final static OperationFactory instance = new OperationFactory();

    private OperationFactory() {}

    public static OperationFactory getInstance() {
        return instance;
    }

    public Operation getOperation(Operation.TYPE operationType) {
        Supplier<Operation> operationSupplier = operations.get(operationType);
        if (operationSupplier != null) {
            return operationSupplier.get();
        }
        throw new IllegalOperationException("No such operation");
    }

}
