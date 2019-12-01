package MediatorPattern;

public class ConcreteColleague2 extends Colleague{
    ConcreteColleague2(Mediator mediator){
        super(mediator);
    }

    /**
     * 调用中介者对象发送信息
     * @param message
     */
    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("ConcreteColleague2收到信息："+message);
    }
}
