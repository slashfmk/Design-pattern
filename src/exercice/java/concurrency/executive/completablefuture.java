package exercice.java.concurrency.executive;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class completablefuture {

    public static void main(String[] args) {

        // use supplier for task that returns a value
        Supplier<Integer> taskReturnValue = () -> 1;
        // Runnable tsk
        Runnable taskNoreturnValue = () -> System.out.println("Cool stuff");

        var future = CompletableFuture.supplyAsync(taskReturnValue);

        try {
            var result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
