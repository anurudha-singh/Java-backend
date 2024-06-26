import java.util.function.Function;
 class FunctionCompositionExample {
    static void showFunctionalComposition(){
          // Create functions for adding 2 and multiplying by 3
          Function<Integer, Integer> addTwo = x -> x + 2;
          Function<Integer, Integer> multiplyByThree = x -> x * 3;
          // Function composition using "andThen"
          Function<Integer, Integer> addAndMultiply = addTwo.andThen(multiplyByThree);
          // Apply the composed function to a value
          int result = addAndMultiply.apply(5);
          System.out.println("Result: " + result); // Output: Result: 21
    }
}