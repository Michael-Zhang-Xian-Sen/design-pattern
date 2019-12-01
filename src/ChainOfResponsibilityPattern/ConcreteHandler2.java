package ChainOfResponsibilityPattern;

public class ConcreteHandler2 extends Handler {
    public void handlerRequest(int request){
        System.out.println("要求太多了，不准！");
    }
}
