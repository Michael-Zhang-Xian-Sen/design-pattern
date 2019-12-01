package FactoryMethod;

public class ConcreteProductA extends Product{
    private String name = "ProductA";

    ConcreteProductA(){
        System.out.println("创建具体产品A");
    }

    public void show(){
        System.out.println("我的名字是："+name);
    }
}
