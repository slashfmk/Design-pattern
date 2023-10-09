package exercice.designp.decorator;

public interface Decorator {

    void add(double price);
    void setDescription(String description);
    String getDescription();
    double getPrice();
}
