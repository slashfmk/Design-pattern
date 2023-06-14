package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component {

    private int x;
    private int y;
    private int scale;

    private final List<Component> components;

    public Container(int x, int y) {
        this.x = x;
        this.y = y;
        this.scale = 0;
        this.components = new ArrayList<>();
    }

    public void addComponent (Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public void render() {

        System.out.println("Container: position [x:" + this.x + " | y: "+ this.y+"] | length: " + this.scale);

        for (var component : this.components) {
            component.render();
        }
    }

    @Override
    public void resize(int scale) {

        this.scale += scale;

        for (var component : this.components) {
            component.resize(scale);
        }
    }

    @Override
    public void translateXY(int x, int y) {

        this.x += x;
        this.y += y;

        for (var component : this.components) {
            component.translateXY(x, y);
        }
    }
}
