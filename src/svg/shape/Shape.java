package svg.shape;

import svg.element.BaseElement;
import svg.element.Element;

public class Shape extends BaseElement {
    public Shape(String label) {
        super(label);
    }

    /**
     * @return New element of own type.
     */
    @Override
    public Element newInstance() {
        return null;
    }

    /**
     * Load this shape's data from an SVG expression.
     *
     * @param expr
     * @return Whether expression is in the right foramt and data was loaded.
     */
    @Override
    public boolean load(String expr) {
        return false;
    }


}
