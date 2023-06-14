package Behavioral.strategy;

public class Main {

    public static void main (String[] args) {

        ImageStorage image = new ImageStorage("Panda");

        image.applyFilter(new BlackAndWhite());
        image.compressImage(new JpegCompressor());

        image.store();

    }
}
