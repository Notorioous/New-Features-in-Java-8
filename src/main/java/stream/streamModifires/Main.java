package stream.streamModifires;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");

        //Использование метода distinct() предполагает что элементы Stream-a реализовывают метод equals()

         strings.stream()
                .distinct()
                .forEach(System.out::println);

         //Если же класс не реализовывает метод equals()!!!!, метод distinct() не будет иметь смысла

        List<Person> people = Arrays.asList(new Person("Jo"),
                new Person("Jo"),
                new Person("Lui"));

        people.stream()
                .distinct()
                .forEach(System.out::println);

        List<Person> people1 = Arrays.asList(new Person("Zoi"),
                new Person("Jo"),
                new Person("Lui"));

        //Если элементы Stream-a не реализуют Comparable, мы получим ClassCastException при вызове sorted.

//        people.stream()
//                .sorted()                           //exception
//                .forEach(System.out::println);

        people1.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        List<Person> people2 = Arrays.asList(new Person("Zoi"),
                new Person("Jo"),
                new Person("Andy"),
                new Person("Lui"));

        //На самом деле вывод будет разный каждый раз, Stream то параллельный, значит обрабатывать данные он будет в несколько потоков.

        people2.parallelStream()
                .forEach(System.out::println);

    }

}
