package exercice.dep_injection;

import exercice.dep_injection.calculators.TaxCalculatorCalifornia;
import exercice.dep_injection.calculators.TaxCalculatorIowa;

public class Playground {

    public static void main(String[] args) {

        var iowaTaxCalculator = new TaxCalculatorIowa();

        // Constructor injection
        var chart = new Chart(iowaTaxCalculator);

        chart.add("Sugar", 6500);
        chart.add("Potatos", 75.98);
        chart.add("Macbook pro M2", 7800);

        chart.viewItems();
        chart.totalToPay();

        // setter injection
        chart.setCalculator(new TaxCalculatorCalifornia());
        chart.viewItems();
        chart.totalToPay();
    }

}
