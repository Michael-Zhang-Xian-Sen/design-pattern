package FlyweightPattern;

public class SharedFlyweight extends Flyweight{
    private String name;

    SharedFlyweight(String name){
        this.name = name;
    }

    public void Operation(){
        System.out.println("具体Flyweight："+name);
    }
}
