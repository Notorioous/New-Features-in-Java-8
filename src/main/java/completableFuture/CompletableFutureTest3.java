package completableFuture;

import stream.Collect;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Если мы захотим запустить несколько CompletableFuture параллельно, то сделать это можно с помощью allOf()
        CompletableFuture what = CompletableFuture.supplyAsync(() -> "What");
        CompletableFuture the = CompletableFuture.supplyAsync(() -> "the");
        CompletableFuture future = CompletableFuture.supplyAsync(() -> "future");
        CompletableFuture holds = CompletableFuture.supplyAsync(() -> "holds");

        CompletableFuture<Void> all = CompletableFuture.allOf(what,the,future,holds);

        all.get();

        System.out.println(what.isDone());
        System.out.println(the.isDone());
        System.out.println(future.isDone());
        System.out.println(holds.isDone());

        //Но стоит помнить, что метод allOf() лишь запускает переданные задачи. Результат работы нужно получать у каждого CompletableFuture отдельно.
        // Если же нам нужно получить результат работы всех задач, тогда можно воспользоваться методом join() и Stream API.

//        String result = Stream.of(what,the,future,holds)
//                .map(m -> m.join())
//                .collect(Collectors.joining(" "));
//
//        System.out.println(result);
    }
}
