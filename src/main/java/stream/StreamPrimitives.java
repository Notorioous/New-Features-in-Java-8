package stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamPrimitives {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1,2,3,4);
        LongStream longStream = LongStream.of(5,6,7,8);
        DoubleStream doubleStream = DoubleStream.of(9,10,11,12);

        //Creating using range
        IntStream intStreamRange = IntStream.range(1,100);
        intStreamRange.forEach(System.out::println);

        //Creating using rangeClosed

        IntStream intStream1 = IntStream.rangeClosed(1,100);
        intStream1.forEach(System.out::println);
        //IntStream можно преобразовать в LongStream, либо в DoubleStream

//        DoubleStream doubleStream1 = intStream1.asDoubleStream();
//        doubleStream1.forEach(System.out::println);

        //Все примитивные стримы можно преобразовать в массив примитивов
        int[] ints = intStream.toArray();
        for (Integer i: ints) {
            System.out.println(i);
        }

    }
}
