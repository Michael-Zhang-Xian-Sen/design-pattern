package AbstractFactory.product;

public class ProductB1 implements AbstractProductB {
    private String name = "ProductB1";

    public void sayName(){
        System.out.println("我的名字是："+name);
    }
}
