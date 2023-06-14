package Behavioral.command.editor;

public interface UndoableCommand extends Command {
    void unexecute ();
}
