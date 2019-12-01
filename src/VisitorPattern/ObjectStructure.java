package VisitorPattern;

import java.util.ArrayList;

public class ObjectStructure {
    private ArrayList<Element> elements = new ArrayList<Element>();

    public void attch(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void display(Visitor visitor){
        for(Element element:elements){
            element.accept(visitor);
        }
    }
}
