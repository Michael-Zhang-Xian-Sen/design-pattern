package MediatorPattern;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(concreteColleague1);
        mediator.setColleague2(concreteColleague2);

        concreteColleague1.send("Hello! My name is concreteColleague1!");
        concreteColleague2.send("你好！我的名字叫concreteColleague2");
    }
}
