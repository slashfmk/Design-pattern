package strategy;

public class ImageStorage {

    private String  image;

    public ImageStorage (String image) {
        this.image = image;
    }

    public void applyFilter (IFilter filter) {
        filter.apply(this.image);
    }

    public void compressImage (ICompressor compressor) {
        compressor.compress(this.image);
    }

    public void store () {
        this.compressImage(new PngCompressor());
        this.applyFilter(new HueAndSaturation());
        this.applyFilter(new BlackAndWhite());

        System.out.println("Storing image " + this.image);
    }

}
