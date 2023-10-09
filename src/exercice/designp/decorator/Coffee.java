package exercice.designp.decorator;

public class Coffee implements Decorator {

    private double price;
    private String description;


    public Coffee () {
        this.price = 0.5;
        this.description = "Base coffee! ";;
    }

    @Override
    public void add(double price) {
        this.price += price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description += description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
