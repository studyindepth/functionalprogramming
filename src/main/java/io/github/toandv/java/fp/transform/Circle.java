package io.github.toandv.java.fp.transform;

import static io.github.toandv.java.fp.transform.Type.CIRCLE;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color, CIRCLE);
    }

    @Override
    public String toString() {
        return "Circle(" + color + ")";
    }
}
