package state;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Rectangle tool selected!");
    }

    @Override
    public void mouseUp() {
        System.out.println("Rectangle drawn!!!");
    }
}
