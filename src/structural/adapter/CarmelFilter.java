package structural.adapter;

import structural.adapter.cinematicFilter.Carmel;

public class CarmelFilter implements Filter {

    private final Carmel carmel;

    public CarmelFilter(Carmel carmel) {
        this.carmel = carmel;
    }

    @Override
    public void apply(Image image) {
        this.carmel.init();
        this.carmel.render(image);
    }
}
