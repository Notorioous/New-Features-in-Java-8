package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "Hi";
//        });

//        System.out.println(future.get());

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"Hi");
        Thread.sleep(1000);
        future1.thenAccept(result -> System.out.println(result));

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"Hi");
        Thread.sleep(1000);
        future2.thenApply(result -> {
            System.out.println(result + " all");
            return result;
        });
        future2.thenAccept(result -> System.out.println(result + " world"));

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->"Hi");
        future3.thenApplyAsync(result->{
            System.out.println(result + " all");
            return result;
        });
        Thread.sleep(1000);



    }
}
