package structural.decorator;

public class EncryptedStream implements Stream {

    private Stream stream;

    @Override
    public void write(String data) {
        var encrypted = "#&yjhhdjf"+data;
        this.stream.write(encrypted);
    }
}
