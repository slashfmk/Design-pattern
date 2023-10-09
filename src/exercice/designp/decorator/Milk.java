package exercice.designp.decorator;

public class Milk implements Decorator {

    private final double price = 1.5;
    private final Decorator decorator;

    public Milk(Decorator decorator) {
        this.decorator = decorator;
        this.setDescription(this.getDescription());
        this.add(this.price);
    }
    @Override
    public void add(double price) {
        this.decorator.add(price);
    }

    @Override
    public void setDescription(String description) {
        this.decorator.setDescription(description);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return " | Flavored with the best ireland milk | ";
    }
}
