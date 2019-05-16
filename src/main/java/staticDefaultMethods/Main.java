package staticDefaultMethods;

public class Main {
    public static void main(String[] args) {

        Human human = new Human(){};
        human.walk();

        Runner runner = new Runner();
        runner.walk();

        Human.walker();
    }
}
