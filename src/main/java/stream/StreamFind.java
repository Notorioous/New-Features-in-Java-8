package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFind {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("BLOB", "Java is the best", "Java 8", "Java 9", "Jacoco");

        Optional<String> java = strings.stream()
                .filter(str -> str.contains("Java"))
                .findAny();

        System.out.println(java);

        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 12, 15);
        Optional<Integer> first = numbers.stream()
                .filter(num -> num > 10)
                .findFirst();
        System.out.println(first);
    }



}
