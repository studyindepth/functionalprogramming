package io.github.toandv.java.fp.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.toandv.java.fp.transform.Color.*;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Mapping {
    public static void main(String[] args) {
        List<Circle> circles = Arrays.asList(
                new Circle(RED),
                new Circle(YELLOW),
                new Circle(GREEN),
                new Circle(AQUA),
                new Circle(BLUE),
                new Circle(PINK)
        );
        System.out.println(circles);

        // imperative way

        // ceremony
        List<Polygon> polygons = new ArrayList<>(circles.size());
        // ceremony
        for (Circle circle : circles) {
            // real logic
            Polygon polygon = new Rectangle(circle.color);

            // ceremony
            polygons.add(polygon);
        }

        System.out.println(polygons);

        // functional way
        List<Polygon> polygons1 = circles.stream().map(circle -> new Rectangle(circle.color)).collect(Collectors.toList());
        // Scala: circles.map(circle => new new Polygon(circle.color, 4))
        System.out.println(polygons1);
    }
}
