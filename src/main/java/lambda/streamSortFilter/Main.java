package lambda.streamSortFilter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("vzgo",33),
                new Person("alla",18),new Person("poncho",24));

        personList.forEach(System.out::println);
        //stream filter
        personList.stream().filter(p -> p.getAge() >= 20).forEach(System.out::println);
        personList.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);

        //average with map
       double average = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(average);
    }
}
