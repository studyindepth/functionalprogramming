package io.github.toandv.java.fp.transform;

import static io.github.toandv.java.fp.transform.Type.HEXAGON;

/**
 * @author toandv
 * @github https://github.com/toandv
 * @since 9/18/2016.
 */
public class Hexagon extends Polygon {

    public Hexagon(Color color) {
        super(color, HEXAGON, 6);
    }

    @Override
    public String toString() {
        return "Hexagon(" + color + ")";
    }
}
