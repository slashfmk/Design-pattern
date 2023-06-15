package structural.composite;

public class Main {

    public static void main(String[] args) {

        Container container = new Container(0, 0);

        var circle1 = new Circle(2, 1, 15);
        var circle2 = new Circle(5, 3, 3);

        var square1 = new Square(2, 7, 32);
        var square2 = new Square(14, 34, 67);


        container.addComponent(circle1);
        container.addComponent(square1);
        container.addComponent(circle2);

        container.render();
        System.out.println("+++++++++++++");

        container.translateXY(-22, 77);
        container.resize(78);
        container.render();

        System.out.println("+++++++++++++");
        container.remove(square1);
        container.render();
    }
}
