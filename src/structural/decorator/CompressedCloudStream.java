package structural.decorator;

public class CompressedCloudStream implements Stream {

    private final Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = this.compress(data);
        this.stream.write(compressed);
    }

    private String compress (String data) {
        return data.substring(2, 5);
    }

}
