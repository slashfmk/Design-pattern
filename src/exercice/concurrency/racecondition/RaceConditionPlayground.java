package exercice.concurrency.racecondition;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionPlayground {

    public static void main(String[] args) {

        var state = new DownloadStatus();

        List<Thread> threadList = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadTask(state));
            thread.start();
            threadList.add(thread);
        }


        for (var thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(state.getTotalBytes());
    }

}
