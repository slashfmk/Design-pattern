package Behavioral.strategy;

public class JpegCompressor implements ICompressor {

    @Override
    public void compress(String image) {
        System.out.println("Compressing " + image + " to JPEG ...");
    }
}
