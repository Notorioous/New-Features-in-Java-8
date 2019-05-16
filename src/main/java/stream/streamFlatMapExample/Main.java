package stream.streamFlatMapExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        List<Human> humans = asList(
                new Human("Sam",asList("Buddy","Lucy")),
                new Human("Bob",asList("Frankie","Rosie")),
                new Human("Marta",asList("Simba","Tilly"))
        );

        List<String> petNames = new ArrayList<>();

        //before FlatMap
//        for (Human human : humans) {
//            petNames.addAll(human.getPets());
//        }
//        System.out.println(petNames);

        //after

        //ergar variant
//        petNames = humans.stream()
//                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
//                .flatMap(pet -> pet.stream())  //"разворачиваем" Stream<List<Pet>> в Stream<Pet>
//                .collect(Collectors.toList());

        //karj variant mennak floatMapov
        petNames = humans.stream()
                .flatMap(human -> human.getPets().stream()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                                                            //"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());

        System.out.println(petNames);
    }
}
