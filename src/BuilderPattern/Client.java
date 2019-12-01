package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        // 要想建造，必须先有指挥
        Director director = new Director();

        // 打算建造一号房子，要有相应的建造者
        Builder ConcreteBuilder1 = new ConcreteBuilder1();

        // 建造一号房子
        director.construct(ConcreteBuilder1);

        // 获取建造好的房子
        Product product1 = ConcreteBuilder1.getProduct();
        product1.show();

        /* 建造二号房子 */

        // 打算建造二号房子，要有相应的建造者
        Builder ConcreteBuilder2 = new ConcreteBuilder2();

        // 建造二号房子
        director.construct(ConcreteBuilder2);

        // 获取建造好的房子
        Product product2 = ConcreteBuilder2.getProduct();
        product2.show();
    }
}
