package DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        Decorator decorator = new Decorator();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        // 装饰者准备进行装饰
        decorator.setComponent(concreteComponent);
        concreteDecoratorA.setComponent(decorator);
        concreteDecoratorB.setComponent(concreteDecoratorA);

        // 执行装饰后的结果
        concreteDecoratorB.Operation();
    }
}
