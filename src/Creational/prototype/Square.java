package Creational.prototype;

public class Square implements Component {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void render() {
        System.out.println("Rendering Square");
    }

    @Override
    public Component clone() {
        return new Square(this.side);
    }
}
