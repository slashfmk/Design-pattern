package exercice.concurrency;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new DownloadTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        thread.interrupt();
        System.out.println("File is ready for scanning.");
    }

    public static void getRuntimeInfo() {
        // Returns the number of active threads in the current process
        System.out.println("Active thread: " + Thread.activeCount());
        //
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
    }
}
