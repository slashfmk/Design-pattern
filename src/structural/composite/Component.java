package structural.composite;

public interface Component {

    void render();
    void resize(int scale);
    void translateXY(int x, int y);
}
