package staticDefaultMethods;

public interface Human {

    default void walk() {
        System.out.println("Ну, я пошел...");
    }

    static void walker(){
        System.out.println("I am walking ... ");
    }
}