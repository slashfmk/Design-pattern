package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Ebook> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Ebook book) {
        this.books.put(book.getFilename(), book);
    }

    public void openEbook(String filename) {
        this.books.get(filename).show();
    }

    public void show() {
        for (var book : this.books.entrySet()) {
            book.getValue().show();
        }
    }
}
