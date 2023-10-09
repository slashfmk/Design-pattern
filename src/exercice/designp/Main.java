package exercice.designp;

import exercice.designp.decorator.Coffee;
import exercice.designp.decorator.Decorator;
import exercice.designp.decorator.Milk;
import exercice.designp.decorator.Sugar;

public class Main {

    public static void main(String[] args) {

        var coffee = new Coffee();

        getState(coffee);

        new Sugar(coffee);

        getState(coffee);

        new Milk(coffee);
        getState(coffee);
    }


    public static void getState(Decorator decorator) {
        System.out.println("************");
        System.out.println("Total price : $" + decorator.getPrice());
        System.out.println("Description : " + decorator.getDescription());
        System.out.println("************\n");
    }
}
