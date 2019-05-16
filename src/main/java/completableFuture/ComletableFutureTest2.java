package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComletableFutureTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 2))
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 5));
        System.out.println(future.get());

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> anotherFuture1 = CompletableFuture.supplyAsync(() -> 2);
        CompletableFuture<Integer> result = future1.thenCombine(anotherFuture1, (a, b) -> a * b);

        System.out.println(result.get());

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(()-> {
            throw new RuntimeException("error in async running");
            }).handle((obj, err) -> {
                System.out.print(err.getMessage());
                return 10;
        });

        System.out.println(" " + future2.get());

    }
}
