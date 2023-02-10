package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory<T> {

    private List<T> urls;

    public BrowserHistory() {
        this.urls = new ArrayList<>();
    }

    public void push(T url) {
        this.urls.add(url);
    }

    public T pop() {
        var lastUrlIndex = this.urls.size() - 1;
        return this.urls.remove(lastUrlIndex);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }


    private class ListIterator implements Iterator<T> {

        private BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public T current() {
            return (T) history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }
    }


}
