package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    ArrayList<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("房子创建：");
        for(String part:parts){
            System.out.println(part);
        }
    }
}

