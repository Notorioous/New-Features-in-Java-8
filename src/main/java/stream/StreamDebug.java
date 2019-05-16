package stream;

import java.util.Arrays;
import java.util.List;

public class StreamDebug {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//        numbers.stream()
//                .map(n -> debug(n))
//                .forEach(n -> doSomeStaff(n));

        numbers.stream()
                .filter(n -> debug(n))
                .forEach(n -> doSomeStaff(n));



    }
    private static boolean debug(Integer n) {
        System.out.println(n);
        return true;
    }

    private static void doSomeStaff(Integer n) {

    }
}
