import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");
        System.out.println(name);

        //В метод Optional.of нельзя передавать null, если конечно мы не хотим получить NullPointerException

        String john = null;
        Optional<String> name1 = Optional.ofNullable(john);
        System.out.println(name1);

        //Для получения значения из Optional используется метод Optional.get, но он является небезопасным и может бросить NoSuchElementException

        System.out.println(name.get());

//        System.out.println(name1.get());

        //isPresent

        if(name.isPresent()){
            System.out.println(name);
        }

        //ifPresent
        name1.ifPresent(System.out::println);
        name.ifPresent(n -> System.out.println(n));

        //orElse
        System.out.println(name.orElse("blank"));
        System.out.println(name1.orElse("blank"));

        //orElseGet
        System.out.println(name.orElseGet(()-> "blank"));
        System.out.println(name1.orElseGet(()-> "blank"));

        //orElseThrow
        System.out.println(name.orElseThrow(()-> new NullPointerException()));
//        System.out.println(name1.orElseThrow(IllegalAccessError::new));

        System.out.println(name.get().toUpperCase());

        //Optional Flat Map

        Optional<Optional<String>> name3 = Optional.of(Optional.of("John"));



    }
}
