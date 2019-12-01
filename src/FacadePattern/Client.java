package FacadePattern;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.method1();
        System.out.println();

        facade.method2();
        System.out.println();

        facade.method3();
        System.out.println();

        System.out.println("由于Facade的作用，Client根本不知道SubSystem的存在。符合迪米特法则。");
    }
}
