package BuilderPattern;

public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();    // 一个建造者对应一个产品？

    public void buildPart1(){
        product.add("房体使用木块");
    }

    public void buildPart2(){
        product.add("房门使用木门");
    }

    public Product getProduct(){
        return product;
    }
}
