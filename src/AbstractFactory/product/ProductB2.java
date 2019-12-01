package AbstractFactory.product;

public class ProductB2 implements AbstractProductB {
    private String name = "ProductB2";

    public void sayName(){
        System.out.println("我的名字是："+name);
    }
}