package exercice.lambda;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        greet((String message) -> System.out.println(message));

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        // Declarative programming
        list.forEach((item) -> System.out.println("The number: " + item));

        String rep = "Yannick";

        String n = rep.replace("n", "z");

        System.out.println(n);
    }

    public static void greet(Printer printer) {
        System.out.println("Hello world");
    }
}
