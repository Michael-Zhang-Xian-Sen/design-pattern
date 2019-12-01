package VisitorPattern;

import DecoratorPattern.ConcreteDecoratorA;
import DecoratorPattern.ConcreteDecoratorB;

public abstract class Visitor {
    public abstract void getManConclusion(ConcreteElementA concreteElementA);
    public abstract void getWomanConclusion(ConcreteElementB concreteElementB);
}