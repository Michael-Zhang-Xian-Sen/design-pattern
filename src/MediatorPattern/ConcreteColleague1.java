package MediatorPattern;

public class ConcreteColleague1 extends Colleague {
    ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("ConcreteColleague1获得信息："+message);
    }
}
