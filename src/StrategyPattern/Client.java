package StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Context context1;
        Context context2;
        Context context3;

        context1 = new Context(new ConcreteStrategyA());
        context2 = new Context(new ConcreteStrategyB());
        context3 = new Context(new ConcreteStrategyC());

        context1.contextInterface();
        context2.contextInterface();
        context3.contextInterface();
    }
}