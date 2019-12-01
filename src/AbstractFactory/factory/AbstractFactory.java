package AbstractFactory.factory;

import AbstractFactory.product.AbstractProductA;
import AbstractFactory.product.AbstractProductB;

public interface AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
