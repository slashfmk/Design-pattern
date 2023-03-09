package observer;

public class WebPublisher implements Observer, Displayable {

    private final String url;

    public WebPublisher (Subject subject, String url) {
        this.url = url;
        subject.addObserver(this);
    }

    public void unsubscribe (Subject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update() {
        System.out.print("A new stuff has been published | " + this.url);
        display();
    }

    @Override
    public void display() {
        System.out.println(" Showed on screen!!");
    }
}
