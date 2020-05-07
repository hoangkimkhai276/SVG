package svg.shape;

import svg.SVGParser;
import svg.element.Element;

public class Rect extends Shape {
    private double x;
    private double y;
    private double rx;
    private double ry;
    private double width;
    private double height;


    public Rect() {
        super("rect");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRx() {
        return rx;
    }

    public double getRy() {
        return ry;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(label())) {
            x = SVGParser.extractDouble(expr, " x=");
            y = SVGParser.extractDouble(expr, " y=");
            rx = SVGParser.extractDouble(expr, " rx=");
            ry = SVGParser.extractDouble(expr, " ry=");
            width = SVGParser.extractDouble(expr, " width=");
            height = SVGParser.extractDouble(expr, " height=");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return label() + " x: " + x + " y: " + y + " rx: " + rx + " ry: " + ry + " width: " + width + " height: " + height;
    }

    @Override
    public Element newInstance(){
        return new Rect();
    }
}
