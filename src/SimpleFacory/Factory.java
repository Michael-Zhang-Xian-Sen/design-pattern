package SimpleFacory;

public class Factory {
    public Product createProduct(String productName){
        if(productName.equals("productA")){
            return new ProductA();
        }else if (productName.equals("productB")){
            return new ProductB();
        }else {
            return null;
        }
    }
}
