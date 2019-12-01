package VisitorPattern;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attch(new ConcreteElementA());
        objectStructure.attch(new ConcreteElementB());

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        objectStructure.display(concreteVisitorA);
        objectStructure.display(concreteVisitorB);
    }
}
