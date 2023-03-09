package observer;

public class Main {

    public static void  main(String[] args) {

        var newsletter1 = new Newsletter("The new york times");

        var ufc = new JournalStore("UFC", 2345);
        var amazon = new WebPublisher(newsletter1, "www.amazon.com/news");

        newsletter1.setMessage("Cardy Bee is walking naked in the street!");
        newsletter1.setMessage("Michael Jackson died at the age of 50");

    }
}
