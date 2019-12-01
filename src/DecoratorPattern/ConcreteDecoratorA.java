package DecoratorPattern;

public class ConcreteDecoratorA extends Decorator {
    public void Operation(){
        super.Operation();
        System.out.println("我装饰器A来装饰你啦～");
        specialMethod();
    }

    public void specialMethod(){
        System.out.println("嘿哟嘿哟 妈咪妈咪哄～Decorate You！");
    }
}
