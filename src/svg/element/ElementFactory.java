package svg.element;

import svg.shape.Circle;
import svg.shape.Rect;

import java.util.*;

public class ElementFactory {
    public Element makeElement(String label){
        if(label.equals("circle")){
            return new Circle();
        }else if(label.equals("rect")){
            return new Rect();
        }
        return null;
    }
    public List<Element> prototypes(){
        ArrayList<Element> elements = new ArrayList<>();
        elements.add(new Circle());
        elements.add(new Rect());
        return elements;
    }

}
