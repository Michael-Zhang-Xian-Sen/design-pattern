package VisitorPattern;

public class ConcreteElementB extends Element {
    public void accept(Visitor visitor){
        visitor.getWomanConclusion(this);
    }
}
