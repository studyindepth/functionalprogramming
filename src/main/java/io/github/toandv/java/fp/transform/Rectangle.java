package io.github.toandv.java.fp.transform;

import static io.github.toandv.java.fp.transform.Type.RECTANGLE;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Rectangle extends Polygon {

    public Rectangle(Color color) {
        super(color, RECTANGLE, 4);
    }

    @Override
    public String toString() {
        return "Rectangle(" + color + ")";
    }
}
