package io.github.toandv.java.fp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class FistClassFunctions {
    public static void main(String[] args) {

        // passed as a parameter, high-order function
        BiFunction<List<Integer>, BiFunction<Integer, Integer, Integer>, Integer> reduce = (numbers, combiner) -> {
            int acc = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                acc = combiner.apply(acc, numbers.get(i));
            }
            return acc;
        };

        // returned as a result
        Function<String, BiFunction<Integer, Integer, Integer>> createFunction = name -> {
            switch (name) {
                case "add": return (a, b) -> a + b;
                case "sub": return (a, b) -> a - b;
                case "mul": return (a, b) -> a * b;
                case "div": return (a, b) -> a / b;
                default: return null;
            }
        };

        BiFunction<Integer, Integer, Integer> add = createFunction.apply("add");
        BiFunction<Integer, Integer, Integer> mul = createFunction.apply("mul");

        Integer sum = reduce.apply(Arrays.asList(1, 2, 3, 4, 5), add);
        Integer product = reduce.apply(Arrays.asList(1, 2, 3, 4, 5), mul);

    }
}
