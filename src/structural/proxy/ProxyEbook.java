package structural.proxy;

public class ProxyEbook implements Ebook {

    private final String filename;
    private RealEbook realEbook;

    public ProxyEbook(String filename) {
        this.filename = filename;
    }

    @Override
    public void show() {
        if (realEbook == null) {
            realEbook = new RealEbook(this.filename);
            this.realEbook.show();
        }
    }

    @Override
    public String getFilename() {
        return this.filename;
    }
}
