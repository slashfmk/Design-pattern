package exercice.java.concurrency.racecondition;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionPlayground {

    public static void main(String[] args) {

        confinement();

    }

    // Race condition fixed with confinement
    public static void confinement() {

        List<Thread> threadList = new ArrayList<>();
        List<DownloadStatus> downloadTStatusList = new ArrayList<>();

        for (var i = 0; i < 10; i++) {

            var status = new DownloadStatus();
            var thread = new Thread(new DownloadTask(status));
            thread.start();
            threadList.add(thread);
            downloadTStatusList.add(status);
        }

        for (var thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        var totalBytes = downloadTStatusList.stream()
                .map(DownloadStatus::getTotalBytes)
                .reduce(Integer::sum);

        System.out.println("Total bytes downloaded " + totalBytes.orElse(0));
    }

    // Code with race condition
    public static void raceCondition() {

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
