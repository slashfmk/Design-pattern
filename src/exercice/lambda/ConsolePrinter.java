package exercice.lambda;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Message: " + message);
    }
}
