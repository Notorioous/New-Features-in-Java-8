package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        Optional<Integer> reduce = numbers.stream()
                .reduce((left, right) -> left + right);

        reduce.ifPresent(System.out::println);

        //  В первом случае результат метода reduce вернул Optional<Integer> т.к. мы не указывали начальное значение.
        //  Во втором случае мы указали начальное значение, и метод reduce уже возвращает обычный Integer.

        Integer reduce1 = numbers.stream()
                .reduce(3, (left, right) -> left + right);

        System.out.println(reduce1);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);

        Integer reduce2 = numbers1.stream()
                .reduce(10, (identity, val) -> identity * val, (left, right) -> left + right);

        System.out.println(reduce2);

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 5, 7);

        //В данном примере мы указали начальное значение и аккумулятор который и оставляет меньшее значение.

        Integer min = numbers3.stream()
                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);

        System.out.println(min);

        List<String> strings = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");

        Optional<String> reduce3 = strings.stream()
                .reduce((left, right) -> left.length() > right.length() ? left : right);

        //aranc accumulyatori
        reduce3.ifPresent(System.out::println);
    }


}
