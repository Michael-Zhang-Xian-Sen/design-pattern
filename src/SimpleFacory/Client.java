package SimpleFacory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();

        // 获得产品A和产品B
        Product productA = factory.createProduct("productA");
        Product productB = factory.createProduct("productB");
    }
}
