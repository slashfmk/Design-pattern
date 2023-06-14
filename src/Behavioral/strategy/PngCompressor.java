package Behavioral.strategy;

public class PngCompressor implements ICompressor {
    @Override
    public void compress(String image) {
        System.out.println("Compressing " + image + " to PNG ...");
    }
}
