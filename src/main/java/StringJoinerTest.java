import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerTest {
    public static void main(String[] args) {
        java.util.StringJoiner stringJoiner = new java.util.StringJoiner(":");
        stringJoiner.add("Arya");
        stringJoiner.add("John");
        stringJoiner.add("Serseya");
        System.out.println(stringJoiner.toString());

        List<String> databases = Arrays.asList("OracleDB", "Mongo", "PostgreSQL", "MySQL");
        String string = String.join(" , ",databases);
        System.out.println(string);

        //Joining with Stream Collect

        List<String> frameworks = Arrays.asList("Spring", "Hibernate", "JPA", "JSF");
        String collect = frameworks.stream()
                .collect(Collectors.joining(" ,"));
        System.out.println(collect);
    }
}
