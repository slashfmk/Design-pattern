package structural.composite;

public class Circle implements Component {

    private int x;
    private int y;

    private int rad;

    public Circle(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    @Override
    public void render() {
        System.out.println("Circle: position [x:" + this.x + " | y: "+ this.y+"] | radius length: " + this.rad);
    }

    @Override
    public void resize(int scale) {
        this.rad += scale;
    }

    @Override
    public void translateXY(int x, int y) {
        this.x += x;
        this.y += y;
    }

}
