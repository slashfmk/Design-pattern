package structural.proxy;

import java.util.Scanner;

public class SecureEbookProxy implements Ebook {

    private String filename;
    private Scanner scanner;
    private RealEbook realEbook;


    public SecureEbookProxy(String filename) {
        this.filename = filename;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void show() {
        System.out.println("Please enter the passcode");
        var passCode = scanner.nextInt();

        if (passCode == 1234) {
            if (this.realEbook == null) {
                this.realEbook = new RealEbook(this.filename);
            }
        } else {
            System.out.println("You cannot access the ebook, wrong pass code entered!");
        }
    }

    @Override
    public String getFilename() {
        return this.filename;
    }
}
