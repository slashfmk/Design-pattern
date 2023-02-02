package state;

public class Main {

    public static void main (String[] args) {

        var canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
