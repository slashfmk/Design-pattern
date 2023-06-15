package structural.adapter;

public class ImageView {

    private final Image image;

    public ImageView(Image image) {
        this.image = image;

    }

    public void applyFilter(Filter imageFilter) {
        imageFilter.apply(this.image);
    }
}
