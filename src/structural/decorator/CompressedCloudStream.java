package structural.decorator;

public class CompressedStream implements  Stream {
    private Stream stream;

    @Override
    public void write(String data) {
        this.stream.write(data);
    }

    private void compress(String data) {
        return String.
    }
}
