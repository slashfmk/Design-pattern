package exercice.solid.openclose;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new IowaTax());

        calculator.calculate(5870);
    }
}
