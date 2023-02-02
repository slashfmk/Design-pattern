package strategy;

public class BlackAndWhite implements IFilter {
    @Override
    public void apply(String image) {
        System.out.println("Applying black and white filter on " + image + " ...");
    }
}
