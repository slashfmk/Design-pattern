package exercice.java.concurrency.executive;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecPlayground {

    public static void main(String[] args) {

        var executor = Executors.newFixedThreadPool(3);


        try {
            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");

            try {
                var result = future.get();
                System.out.println(result);;
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

        } finally {
            executor.shutdown();
        }

    }
}
