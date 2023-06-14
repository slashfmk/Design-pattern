package Behavioral.memento;

import java.util.*;

public class History {

    private final Stack<EditorState> states;

    public History() {
        this.states = new Stack<>();
    }

    public void push(EditorState editorState) {
        this.states.add(editorState);
    }

    public EditorState pop() {
        var lastState = this.states.pop();
        return this.states.peek();
    }

}
