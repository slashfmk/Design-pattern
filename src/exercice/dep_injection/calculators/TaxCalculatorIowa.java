package exercice.dep_injection.calculators;

import exercice.dep_injection.calculators.Calculator;

public class TaxCalculatorIowa implements Calculator {
    @Override
    public double taxCalculate(double amount) {
        return (amount * 7) / 100;
    }
}
