package exercice.java.dep_injection.calculators;

public class TaxCalculatorIowa implements Calculator {
    @Override
    public double taxCalculate(double amount) {
        return (amount * 7) / 100;
    }
}
