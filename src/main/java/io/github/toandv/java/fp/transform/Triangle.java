package io.github.toandv.java.fp.transform;

import static io.github.toandv.java.fp.transform.Type.TRIANGLE;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Triangle extends Polygon {

    public Triangle(Color color) {
        super(color, TRIANGLE, 3);
    }

    @Override
    public String toString() {
        return "Triangle(" + color + ")";
    }
}
