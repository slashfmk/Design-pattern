package structural.composite;

public interface Component {

    public void render();
    public void resize(int scale);
    public void translateXY(int x, int y);
}
