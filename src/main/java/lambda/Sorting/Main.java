package lambda.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        =========================================
        Without Lambda
        =========================================
         */

//        List<User> userList = Arrays.asList(
//                new User("Fzgo",32),
//                new User("Vzgo",12),
//                new User("Exo",42),
//        new User("Mzgo",22)
//        );
//
//        System.out.println("Before sort : ");
//        userList.forEach(System.out::println);
//
//        Collections.sort(userList, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//
//        System.out.println("After sort : ");
//        userList.forEach(System.out::println);
//
//    }

        /*
        =========================================
        With Lambda
        =========================================
         */

        List<User> userList = Arrays.asList(
                new User("Fzgo", 32),
                new User("Vzgo", 12),
                new User("Exo", 42),
                new User("Mzgo", 22)
        );

        System.out.println("Before sort : ");
        userList.forEach(System.out::println);

        //Before Java 8
//        Collections.sort(userList, Comparator.comparingInt(User::getAge));
        //In Java 8, a sort method was added to the List interface
        userList.sort((u1,u2) -> u1.getAge() - u2.getAge());
        userList.sort(Comparator.comparingInt(User::getAge));

        System.out.println("After sort: ");
        userList.forEach(System.out::println);

        /*
        Reverse
         */

        List<User> userList2 = Arrays.asList(
                new User("Sams", 44),
                new User("Appl", 65),
                new User("Huaw", 23),
                new User("Acer", 15)
        );

        System.out.println("Before reverse");
        userList2.forEach(System.out::println);

        Comparator<User> comparator = Comparator.comparing(User::getAge);
        userList2.sort(comparator.reversed());

        System.out.println("After reverse ");
        userList2.forEach(System.out::println);

        /*
        Sorting with multiple conditions
         */

        //before
//        Collections.sort(userList2, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if(o1.getAge() == o2.getAge())
//                    return o1.getName().compareTo(o2.getName());
//                else return o1.getAge() - o2.getAge();
//            }
//        });

        //after
        userList2.sort((o1, o2) -> {if (o1.getAge() == o2.getAge())
        return o1.getName().compareTo(o2.getName());
        else return o1.getAge() - o2.getAge();
        });

        System.out.println("Multiply conditions ");
        for (User user: userList2) {
            System.out.println(user);
        }


    }
}