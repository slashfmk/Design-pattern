package structural.adapter;

import structural.adapter.cinematicFilter.Carmel;

public class Main {

    public static void main(String[] args) {

        var view = new ImageView(new Image(14, 10));

        view.applyFilter(new VividFilter());
        view.applyFilter(new CarmelFilter(new Carmel()));

    }
}
