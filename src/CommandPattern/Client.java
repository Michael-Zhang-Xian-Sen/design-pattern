package CommandPattern;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        BakeChickenCommand bakeChickenCommand = new BakeChickenCommand(receiver);
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(bakeChickenCommand);
        invoker.setCommand(bakeChickenCommand);
        invoker.setCommand(bakeMuttonCommand);

        invoker.executeCommands();
    }
}
