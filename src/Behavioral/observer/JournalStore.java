package Behavioral.observer;

public class JournalStore implements Observer {

    private final String name;
    private final int id;
    private Subject subject;

    public JournalStore (String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void subscribe (Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("New update value received: " + this.subject);
    }

    public String getName() {
        return name;
    }

}
