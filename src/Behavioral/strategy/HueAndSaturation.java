package Behavioral.strategy;

public class HueAndSaturation implements IFilter {
    @Override
    public void apply(String image) {
        System.out.println("Applying Hue and Saturation filter on " + image + " ...");
    }
}
