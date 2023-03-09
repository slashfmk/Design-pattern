package observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private final String name;
    private final List<Observer> subscribers;
    private String message;

    public Newsletter (String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.publish();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void publish() {
        for (var subscriber: this.subscribers) {
            subscriber.update();
        }
    }

    @Override
    public String toString() {
        return "Source: " + this.name + " | subscribers: " + this.subscribers.size();
    }
}
