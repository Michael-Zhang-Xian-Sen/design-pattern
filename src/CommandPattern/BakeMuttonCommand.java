package CommandPattern;

public class BakeMuttonCommand implements Command {
    protected Receiver receiver;

    // 需要指定命令的接收者
    BakeMuttonCommand(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        receiver.BakeMutton();
    }
}
