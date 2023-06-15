package structural.decorator;

public class CloudStream implements Stream {

    private String data;

    @Override
    public void write(String data) {
        this.data = data;
        System.out.println("Storing stream ... " + data);
    }
}
