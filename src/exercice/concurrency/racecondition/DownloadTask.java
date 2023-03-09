package exercice.concurrency.racecondition;

public class DownloadTask implements Runnable {

    private final DownloadStatus status;

    public DownloadTask (DownloadStatus state) {
        this.status = state;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10_000; i++) {

             if(Thread.currentThread().isInterrupted()) break;
            // System.out.println("Downloading " + i + " bytes | " + Thread.currentThread().getName());
            status.incrementTotalBytes();
        }

        System.out.println("Download completed " + Thread.currentThread().getName());
    }
}
