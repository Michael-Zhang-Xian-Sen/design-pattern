package FlyweightPattern;

import java.util.ArrayList;
import java.util.Hashtable;

public class FlyweightFactory{
    private Hashtable hashtable = new Hashtable();

    public FlyweightFactory(){
        hashtable.put("flyweight1",new SharedFlyweight("flyweight1"));
        hashtable.put("flyweight2",new SharedFlyweight("flyweight2"));
        hashtable.put("flyweight3",new SharedFlyweight("flyweight3"));
    }

    public Flyweight getFlyweight(String key){
        SharedFlyweight sharedFlyweight = (SharedFlyweight)hashtable.get(key);

        return sharedFlyweight;
    }
}
