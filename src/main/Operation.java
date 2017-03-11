/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public interface Operation {

    enum TYPE {
        ADD,
        MULTIPLY, DIVIDE, SUBTRACT
    }

    void apply(OperandStack stack);

}
