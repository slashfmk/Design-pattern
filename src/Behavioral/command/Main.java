package Behavioral.command;

import Behavioral.command.fx.Button;

public class Main {

    public static void main(String[] args) {

        var service = new CustomerService();
        var command = new AddCustomerCommand(service);

        var compositeCommand = new CompositeCommand();

        compositeCommand.add(command);
        compositeCommand.add(new DistortCommand());
        compositeCommand.add(new BlackAndWhiteCommand());

        compositeCommand.execute();

        var btn = new Button("Replay all commands", compositeCommand);
        btn.click();
    }
}
