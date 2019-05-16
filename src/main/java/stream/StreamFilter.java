package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamFilter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //before stream
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //after
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //Stream filter + count

        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");

        //before
        int counter = 0;
        for (String s : names) {
            if (s.length() > 4)
                counter++;
        }
        System.out.println(counter);
        //after
        long count = names.stream()
                .filter(s -> s.length() > 4)
                .count();
        System.out.println(count);

        //Stream + multiple filters

        List<String> names1 = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");

        for (String s : names1) {
            if(s != null && !s.isEmpty() && s.contains("a"))
                System.out.println(s);
        }

        names1.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty() && s.contains("a"))
                .forEach(System.out::println);

    }
}
