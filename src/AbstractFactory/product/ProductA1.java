package AbstractFactory.product;

public class ProductA1 implements AbstractProductA {
    private String name = "ProductA1";

    public void sayName(){
        System.out.println("我的名字是："+name);
    }

}
