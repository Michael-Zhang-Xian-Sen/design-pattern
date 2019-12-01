package FactoryMethod;

public class Client {
    public static void main(String[] args) {
//        // 想要什么产品，就要先建什么工厂
//        Factory concreteFactoryA = new ConcreteFactoryA();
//        Product concreteProductA = concreteFactoryA.createProduct();
//
//        // 想要产品B
//        Factory concreteFactoryB = new ConcreteFactoryB();
//        Product concreteProductB = concreteFactoryB.createProduct();
//
//        // 显示产品
//        concreteProductA.show();
//        concreteProductB.show();

        // 想要什么产品，就要先建什么工厂
        Factory concreteFactory = new ConcreteFactoryA();
//        Factory concreteFactory = new ConcreteFactoryB();
        Product concreteProductA = concreteFactory.createProduct();
        Product concreteProductB = concreteFactory.createProduct();

        // 显示产品
        concreteProductA.show();
        concreteProductB.show();
    }
}
