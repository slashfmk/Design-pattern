package exercice.concurrency.racecondition;

public class DownloadStatus {

    private int totalBytes;

    public DownloadStatus() {
        this.totalBytes = 0;
    }

    public int getTotalBytes() {
        return this.totalBytes;
    }

    public void incrementTotalBytes() {
        this.totalBytes++;
    }
}
