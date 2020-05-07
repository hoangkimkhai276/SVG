package svg.shape;

import svg.SVGParser;
import svg.element.Element;

public class Circle extends Shape {
    private double cx;
    private double cy;
    private double r;

    public Circle() {
        super("circle");
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    /**
     * Load this shape's data from an SVG expression.
     *
     * @param expr
     * @return Whether expression is in the right foramt and data was loaded.
     */
    @Override
    public boolean load(String expr) {
        final Double resultx;
        final Double resulty;
        final Double resultr;
        if (expr.contains(label())) {
            resultx = SVGParser.extractDouble(expr, " cx=");
            resulty = SVGParser.extractDouble(expr, " cy=");
            resultr = SVGParser.extractDouble(expr, " r=");
            if (resultx != null) {
                cx = resultx;
                cy = resulty;
                r = resultr;
                return true;
            } else
                return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return label() + "cx: " + cx + " cy: " + cy + " r: " + r;
    }

    /**
     * @return New element of own type.
     */
    @Override
    public Element newInstance() {
        return new Circle();
    }
}
