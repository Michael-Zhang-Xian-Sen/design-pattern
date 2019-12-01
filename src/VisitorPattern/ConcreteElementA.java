package VisitorPattern;

public class ConcreteElementA  extends Element{
    public void accept(Visitor visitor){
        visitor.getManConclusion(this);
    }
}
