package Behavioral.command;

import Behavioral.command.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;
    private String name;

    public AddCustomerCommand (CustomerService service) {
        this.customerService = service;
    }

    @Override
    public void execute() {
        customerService.addCustomer(this.name);
    }
}
