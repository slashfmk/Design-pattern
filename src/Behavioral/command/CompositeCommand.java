package Behavioral.command;

import Behavioral.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private final List<Command> commandList;

    public CompositeCommand () {
        this.commandList = new ArrayList<>();
    }

    public void add (Command command) {
        this.commandList.add(command);
    }

    @Override
    public void execute() {
        for(var command: this.commandList) {
            command.execute();
        }
    }
}
