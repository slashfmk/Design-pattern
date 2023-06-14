package exercice.java.concurrency.executive;


/*
 * o blocking code
 */
public class AsyncApi {

    public static void main(String[] args) {

        var service = new MailService();
        service.sendAsync();

        System.out.println("Hello world!!");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
