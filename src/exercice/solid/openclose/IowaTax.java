package exercice.solid.openclose;

public class IowaTax implements Calculable {

    @Override
    public double calculate(double amount) {
        return (amount * 7) / 100;
    }
}
