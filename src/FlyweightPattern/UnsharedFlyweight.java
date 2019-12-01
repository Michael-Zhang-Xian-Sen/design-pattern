package FlyweightPattern;

public class UnsharedFlyweight extends Flyweight{
    private String name;

    UnsharedFlyweight(String name){
        this.name = name;
    }

    public void Operation(){
        System.out.println("具体Flyweight："+name);
    }

}
