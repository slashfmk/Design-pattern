package command;

import command.fx.Command;

public class DistortCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Distortion command applied");
    }
}
