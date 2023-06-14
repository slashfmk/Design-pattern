package Behavioral.command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<UndoableCommand> commmands;

    public History() {
        this.commmands = new ArrayDeque<>();
    }

    public void push(UndoableCommand command) {
        this.commmands.add(command);
    }

    public UndoableCommand pop() {
        return this.commmands.pop();
    }
}
