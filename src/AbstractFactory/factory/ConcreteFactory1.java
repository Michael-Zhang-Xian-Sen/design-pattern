package AbstractFactory.factory;

import AbstractFactory.product.AbstractProductA;
import AbstractFactory.product.AbstractProductB;
import AbstractFactory.product.ProductA1;
import AbstractFactory.product.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    public AbstractProductA createProductA(){
        return new ProductA1();
    }

    public AbstractProductB createProductB(){
        return new ProductB1();
    }
}
