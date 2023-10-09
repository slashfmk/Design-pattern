package Behavioral.command.fx;

public class Button {

    private final String label;
    private final Command command;


    public Button (String label, Command command) {
        this.label = label;
        this.command = command;
    }

    public String getLabel () {
        return this.label;
    }

    public void click () {
        this.command.execute();
    }
}
