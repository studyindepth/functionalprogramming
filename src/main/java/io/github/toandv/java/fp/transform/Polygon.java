package io.github.toandv.java.fp.transform;

/**
 * @author toandv
 * @github https://github.com/toandv
 * @since 9/18/2016.
 */
public class Polygon extends Shape {

    final int edges;

    public Polygon(Color color, Type type, int edges) {
        super(color, type);
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "edges=" + edges +
                ",color=" + color +
                "}";
    }
}
