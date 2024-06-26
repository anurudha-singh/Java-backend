import java.util.function.IntBinaryOperator;
public class HigherOrderFunctionExample {
    // Higher-Order Function that takes a binary operation function as an argument
    public static int applyOperation(int a, int b, IntBinaryOperator operation) {
        // System.out.println("At 5 "+operation.applyAsInt(a, b));
        return operation.applyAsInt(a, b);
    }
   
}