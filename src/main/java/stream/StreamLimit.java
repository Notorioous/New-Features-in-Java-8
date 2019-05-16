package stream;

import java.util.Arrays;
import java.util.List;

public class StreamLimit {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        numbers.stream()
//                .limit(5)
//                .forEach(System.out::println);

        //Если в limit() указать значение больше чем размер Stream-a,то Stream останется без изменений
        numbers.stream()
                .limit(15)
                .forEach(System.out::println);

        //Если указать отрицательное значение в limit() то мы получим IllegalArgumentException

//        numbers.stream()
//                .limit(-1)
//                .forEach(System.out::println); // java.lang.IllegalArgumentException: -1

        //Метод skip() пропускает первые n элементов Stream-a, где n - заданный параметр .
        // Т.е. если у нас есть Stream из 10 элементов и мы вызвали skip(5), то в Stream останутся вторые 5 элементов

        numbers.stream()
                .skip(5)
                .forEach(System.out::println);

        numbers.stream()
                .skip(-1)
                .forEach(System.out::println);
    }
}
