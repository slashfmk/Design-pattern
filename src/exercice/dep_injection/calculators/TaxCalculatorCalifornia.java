package exercice.dep_injection.calculators;

public class TaxCalculatorCalifornia implements Calculator{
    @Override
    public double taxCalculate(double amount) {
        return (amount * 7.25) / 100;
    }
}
