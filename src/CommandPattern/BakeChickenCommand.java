package CommandPattern;

public class BakeChickenCommand implements Command {
    Receiver receiver;

    BakeChickenCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.BakeChicken();
    }
}
