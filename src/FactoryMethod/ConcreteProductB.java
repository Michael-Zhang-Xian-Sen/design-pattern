package FactoryMethod;

public class ConcreteProductB extends Product {
    private String name = "ProductB";

    ConcreteProductB(){
        System.out.println("创建具体产品B");
    }

    public void show(){
        System.out.println("我的名字是："+name);
    }
}
