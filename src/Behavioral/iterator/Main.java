package Behavioral.iterator;

public class Main {

    public static void main(String[] args) {


        var historyInt = new BrowserHistory<Integer>();

        historyInt.push(2010);
        historyInt.push(2022);
        historyInt.push(1987);
        historyInt.push(5684);

        historyInt.pop();


        var iteratorInt = historyInt.createIterator();

        while (iteratorInt.hasNext()) {
            System.out.println(iteratorInt.current());
            iteratorInt.next();
        }


        var history = new BrowserHistory<String>();
        var iterator = history.createIterator();

        history.push("a");
        history.push("b");
        history.push("c");
        history.push("z");

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }



    }
}
