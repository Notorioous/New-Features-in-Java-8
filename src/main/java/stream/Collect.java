package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers;

        //before
//        for (Integer i: numbers) {
//            if(i % 2 == 0 )
//                evenNumbers.add(i);
//        }
//        System.out.println(evenNumbers);

        //Collector
        evenNumbers = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> names = Arrays.asList("John", "Arya", "Sansa");
        Set<String> upperCaseNames = new HashSet<>();

        //before
//        for (String name: names) {
//            upperCaseNames.add(name.toUpperCase());
//        }
//
//        System.out.println(upperCaseNames);

        //after
        upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(upperCaseNames);

        List<String> names1 = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue = new LinkedList<>();
        //before
//        for (String name : names1) {
//            if(!name.isEmpty())
//                ((LinkedList<String>) queue).add(name);
//        }
//        System.out.println(queue);
        //after

        queue = names1.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));

    }


}
