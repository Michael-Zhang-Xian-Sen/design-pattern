package CommandPattern;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command){
        commands.add(command);
    }

    public void executeCommands(){
        for(Command command:commands){
            command.execute();
        }
    }
}
