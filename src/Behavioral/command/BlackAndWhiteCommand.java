package Behavioral.command;

import Behavioral.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("black and white applied");
    }
}
