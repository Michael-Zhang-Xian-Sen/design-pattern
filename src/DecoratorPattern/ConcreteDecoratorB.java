package DecoratorPattern;

public class ConcreteDecoratorB extends Decorator {
    public void Operation(){
        super.Operation();
        System.out.println("我装饰器B来装饰你啦～");
    }
}
