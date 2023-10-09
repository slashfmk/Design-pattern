package exercice.designp;

import exercice.designp.decorator.Coffee;
import exercice.designp.decorator.Milk;
import exercice.designp.decorator.Sugar;

public class Main {

    public static void main(String[] args) {

        var coffee = new Coffee();

        new Sugar(new Milk(coffee));

        System.out.println(coffee.getPrice());
        System.out.println(coffee.getDescription());
    }
}
