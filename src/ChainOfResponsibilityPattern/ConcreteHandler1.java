package ChainOfResponsibilityPattern;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if(request >=0 && request<=500){
            System.out.println("没问题，涨薪500！");
        }else{
            successor.handlerRequest(request);
        }
    }
}
