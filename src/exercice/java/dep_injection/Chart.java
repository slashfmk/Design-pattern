package exercice.java.dep_injection;

import exercice.java.dep_injection.calculators.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Chart {

    private final List<Product> productList;
    private Calculator calculator;

    public Chart(Calculator calculator) {
        productList = new ArrayList<>();
        this.calculator = calculator;
    }

    public void add(String name, double price) {
        this.productList.add(new Product(name, price));
    }

    public void remove(String name) {
        this.productList.removeIf(product -> product.getName().equals(name));
    }

    public void totalToPay() {
        double tax = this.calculator.taxCalculate(getTotal());
        System.out.println("Before tax: " + this.getTotal() +
                " | tax: " + tax +
                " | Total with tax: " + (this.getTotal() + tax));
    }

    private double getTotal() {
        double total = 0;

        for (var product : this.productList) {
            total += product.getPrice();
        }

        return total;
    }

    public void viewItems() {
        for (var product : this.productList) {
            System.out.println(product.getName() + " | " + product.getPrice());
        }
        System.out.println("");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

}
