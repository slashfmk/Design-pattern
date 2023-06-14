package Behavioral.command;

import Behavioral.command.fx.Command;

public class DistortCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Distortion Behavioral.command applied");
    }
}
