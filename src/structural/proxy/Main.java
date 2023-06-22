package structural.proxy;

public class Main {

    public static void main(String[] args) {

        String[] eBooks = {"Harry potter", "Grudge III", "Cold war 4"};

        var lib = new Library();

        for (var eBookFilename : eBooks) {
            lib.addBook(new SecureEbookProxy(eBookFilename));
        }

        lib.openEbook("Harry potter");

    }
}
