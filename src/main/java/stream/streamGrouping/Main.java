package stream.streamGrouping;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));

        //before
//        Map<String, List<Human>> map = new HashMap<>();
//
//        for (Human human : humans) {
//            String surname = human.getSurname();
//            if (!map.containsKey(surname)) { // если фамилии еще нет - создаем новый список
//                List<Human> humanList = new ArrayList<>();
//                humanList.add(human);
//                map.put(surname, humanList);
//            } else {                        // если фамилия есть - добавляем представителя семьи =)
//                List<Human> humanList = map.get(surname);
//                humanList.add(human);
//            }
//        }
//
//            System.out.println(map);

        //after

        Map<String, List<Human>> map = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname));
        System.out.println(map);

        //Grouping objects by property + count
        Map<String, Long> map1 = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname,Collectors.counting()));
        System.out.println(map1);

        //Grouping objects by property + sum

        Map<String, Long> map2 = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname, Collectors.summingLong(Human::getFriendsAmount)));
        System.out.println(map2);

        //Grouping + mapping
        Map<String, Set<String>> map3 = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname,
                        Collectors.mapping(Human::getName, Collectors.toSet())));
        System.out.println(map3);
        }
    }
