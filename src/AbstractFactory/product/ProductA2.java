package AbstractFactory.product;

public class ProductA2 implements AbstractProductA {
    private String name = "ProductA2";

    public void sayName(){
        System.out.println("我的名字是："+name);
    }
}
