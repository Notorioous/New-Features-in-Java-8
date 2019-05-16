package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 2, 6, 4, 8);

        boolean b = numbers.stream()
                .anyMatch(num -> num % 2 == 0);

        System.out.println(b);

        //Метод allMatch() вернет true в том случае, если в Stream-e все элементы удовлетворяют условию

        boolean b1 = numbers.stream()
                .allMatch(num -> num % 2 == 0);

        System.out.println(b1);

        //Метод noneMatch() вернет true в том случае, если в Stream-e все элементы НЕ удовлетворяют условию

        boolean b2 = numbers.stream()
                .noneMatch(num -> num % 2 == 0);

        System.out.println(b2);
    }

}
