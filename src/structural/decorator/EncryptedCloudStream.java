package structural.decorator;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {

        var encrypted = encrypt(data);
        this.stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "#&yjhhdjf" + data + "ommvrmefom--=++";
    }
}
