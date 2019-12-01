package FlyweightPattern;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight sharedFlyweight1 = flyweightFactory.getFlyweight("flyweight1");
        sharedFlyweight1.Operation();
        Flyweight sharedFlyweight2 = flyweightFactory.getFlyweight("flyweight2");
        sharedFlyweight2.Operation();
        Flyweight sharedFlyweight3 = flyweightFactory.getFlyweight("flyweight3");
        sharedFlyweight3.Operation();

        Flyweight unsharedFlyweight = new UnsharedFlyweight("unsharedFlyweight");
        unsharedFlyweight.Operation();
    }
}
