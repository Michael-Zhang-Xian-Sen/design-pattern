package BuilderPattern;

public class ConcreteBuilder2 extends Builder{
    Product product = new Product();

    public void buildPart1(){
        product.add("房体使用砖块");
    }

    public void buildPart2(){
        product.add("房门使用玻璃门");
    }

    public Product getProduct(){
        return product;
    }
}
