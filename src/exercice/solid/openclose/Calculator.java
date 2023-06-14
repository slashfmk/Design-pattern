package exercice.solid.openclose;

public class Calculator {

    private Calculable calculable;

    public Calculator(Calculable calculable) {
        this.calculable = calculable;
    }

    public void setStateCalculator(Calculable calculable) {
        this.calculable = calculable;
    }

    public void calculate(double amount) {
        var tax = this.calculable.calculate(amount);
        System.out.println("The tax for " + amount + " is " + tax);
    }
}