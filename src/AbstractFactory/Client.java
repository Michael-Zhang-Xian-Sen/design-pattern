package AbstractFactory;

import AbstractFactory.factory.AbstractFactory;
import AbstractFactory.factory.ConcreteFactory1;
import AbstractFactory.factory.ConcreteFactory2;
import AbstractFactory.product.AbstractProductA;
import AbstractFactory.product.AbstractProductB;
import FactoryMethod.Product;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
//        AbstractFactory factory = new ConcreteFactory2();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        productA.sayName();
        productB.sayName();
    }
}
