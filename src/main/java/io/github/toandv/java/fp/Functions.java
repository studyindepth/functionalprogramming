package io.github.toandv.java.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Functions {
    public static void main(String[] args) {

        // Define as function
        BiFunction<Integer, Integer, Integer> f = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> add = f;
        Integer sum = add.apply(1, 2);

        // created dynamically
        Object obj = new Object();
        Function<String, String> func = s -> s.toUpperCase();

    }
}
