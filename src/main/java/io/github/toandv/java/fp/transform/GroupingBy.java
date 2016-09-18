package io.github.toandv.java.fp.transform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.github.toandv.java.fp.transform.Color.*;
import static io.github.toandv.java.fp.transform.Color.BLUE;
import static io.github.toandv.java.fp.transform.Color.PINK;

/**
 * @author toandv
 * @github https://github.com/toandv
 * @since 9/18/2016.
 */
public class GroupingBy {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(PINK),
                new Circle(AQUA),
                new Triangle(YELLOW),
                new Circle(YELLOW),
                new Triangle(PINK),
                new Triangle(AQUA)
        );

        // group by type, Circle and Triangle

        // imperative way :(
        // lots of code, tedious, I don't want to do

        // functional way, absolutely :)
        Map<Type, List<Shape>> shapesByType = shapes
                .stream()
                .collect(Collectors.groupingBy(shape -> shape.type));

        System.out.println(shapesByType);
    }
}
