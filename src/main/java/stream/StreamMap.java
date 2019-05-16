package stream;

import com.sun.xml.internal.ws.util.StreamUtils;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        //before
        for (Integer i : numbers) {
            System.out.println(i * 2);
        }
        //after
        numbers.stream()
                .map(i -> i*2)
                .forEach(System.out::println);


        List<String> names = Arrays.asList("john", "arya", "sansa");

        //before
        for (String s : names) {
            char [] chars = s.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            System.out.println(new String(chars));
        }
        //after StringUtil capitalize
        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);


    }
}
