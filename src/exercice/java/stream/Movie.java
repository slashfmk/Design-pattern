package exercice.java.stream;

public class Movie {

    private final int length;
    private final String name;

    public Movie(int length, String name) {
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}
