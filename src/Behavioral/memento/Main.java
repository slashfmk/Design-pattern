package Behavioral.memento;

public class Main {

    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.create());

        editor.setContent("b");
        history.push(editor.create());

        editor.setContent("c");
        history.push(editor.create());

        // editor.undo();
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }

}
