package structural.proxy;

public class RealEbook implements Ebook  {

    private String filename;

    public RealEbook(String filename) {
        this.filename = filename;
        this.load();
    }

    private void load() {
        System.out.println("loading the ebook " + this.filename);
    }

    public void show() {
        System.out.println("Showing the ebook " + this.filename);
    }

    public String getFilename() {
        return this.filename;
    }
}
