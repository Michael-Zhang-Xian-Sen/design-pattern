package ChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        handler1.handlerRequest(500);
        handler1.handlerRequest(5000);
    }
}
