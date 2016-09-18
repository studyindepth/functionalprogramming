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
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
        Integer added = add.apply(1, 2); // 3

        // created dynamically
        Object obj = new Object();
        Function<String, String> f = s -> s.toUpperCase();

        // passed as a parameter, high-order function
        BiFunction<List<Integer>, BiFunction<Integer, Integer, Integer>, Integer> reduce = (numbers, combiner) -> {
            int acc = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                acc = combiner.apply(acc, numbers.get(i));
            }
            return acc;
        };
        reduce.apply(Arrays.asList(1, 2, 3, 4), add); // 1+2+3+4=10
        reduce.apply(Arrays.asList(1, 2, 3, 4), sub); // 1-2-3-4=-8

        Function<String, BiFunction<Integer, Integer, Integer>> createFunction = name -> {
            switch (name) {
                case "add":
                    return (a, b) -> a + b;
                case "sub":
                    return (a, b) -> a - b;
                case "mul":
                    return (a, b) -> a * b;
                case "div":
                    return (a, b) -> a / b;
                default:
                    return null;
            }
        };

        BiFunction<Integer, Integer, Integer> mul = createFunction.apply("mul");
        Integer multiplied = mul.apply(2, 4); // 8
    }
}
