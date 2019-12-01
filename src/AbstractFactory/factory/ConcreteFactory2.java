package AbstractFactory.factory;

import AbstractFactory.product.*;

public class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA(){
        return new ProductA2();
    }

    public AbstractProductB createProductB(){
        return new ProductB2();
    }
}
