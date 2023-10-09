package Creational.prototype;

public class Main {


    public static void main(String[] args) {

        // Create comp
        var circle = new Circle(23);
        var square = new Square(35);

        circle.getRadius();

        var contextMenu = new ContextMenu();

        var copy1 = contextMenu.duplicate(circle);

        copy1.render();
    }
}
