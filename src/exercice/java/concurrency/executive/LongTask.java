package exercice.java.concurrency.executive;

public class LongTask {

    public static void simulate() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
