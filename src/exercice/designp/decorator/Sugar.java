package exercice.designp.decorator;

public class Sugar implements Decorator {

    private final double price = .25;
    private final String description = " | Sweeter sugar | ";
    private final Decorator decorator;


    public Sugar(Decorator decorator) {
        this.decorator = decorator;
        this.setDescription(this.description);
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
}
