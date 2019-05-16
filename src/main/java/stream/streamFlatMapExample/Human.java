package stream.streamFlatMapExample;

import java.util.List;

public class Human {
        private final String name;
        private final List<String> pets;

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }
}
