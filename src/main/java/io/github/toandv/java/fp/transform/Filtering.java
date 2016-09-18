package io.github.toandv.java.fp.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.toandv.java.fp.transform.Color.*;
import static io.github.toandv.java.fp.transform.Color.BLUE;
import static io.github.toandv.java.fp.transform.Color.PINK;

/**
 * @author toandv
 * @github https://github.com/toandv
 * @since 9/18/2016.
 */
public class Filtering {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(RED),
                new Rectangle(YELLOW),
                new Triangle(GREEN),
                new Rectangle(AQUA),
                new Circle(BLUE),
                new Hexagon(PINK)
        );

        System.out.println(shapes);

        // imperative way

        // ceremony
        List<Shape> circles = new ArrayList<>(shapes.size());
        // ceremony
        for (Shape shape : shapes) {
            // real logic
            if (shape instanceof Circle)
                circles.add(shape);
        }
        System.out.println(circles);

        List<Shape> circles1 = circles
                .stream()
                .filter(shape -> shape instanceof Circle)
                .collect(Collectors.toList());

        System.out.println(circles1);
    }
}
