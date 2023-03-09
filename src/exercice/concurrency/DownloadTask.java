package exercice.concurrency;

public class DownloadTask implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            if(Thread.currentThread().isInterrupted()) break;
            System.out.println("Downloading " + i + " bytes | " + Thread.currentThread().getName());
        }

        System.out.println("Download completed " + Thread.currentThread().getName());
    }
}
