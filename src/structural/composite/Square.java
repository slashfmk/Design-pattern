package structural.composite;

public class Square implements Component {

    private int x;
    private int y;
    private int side;

    public Square(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void render() {
        System.out.println("Square: position [x:" + this.x + " | y: "+ this.y+"] | side length: " + this.side);
    }

    @Override
    public void resize(int scale) {
        this.side += scale;
    }

    @Override
    public void translateXY(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
