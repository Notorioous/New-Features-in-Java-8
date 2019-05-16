package stream.streamGrouping;

public class Human {

    private final String name, surname;
    private final int friendsAmount;

    public Human(String name, String surname, int friendsAmount) {
        this.name = name;
        this.surname = surname;
        this.friendsAmount = friendsAmount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getFriendsAmount() {
        return friendsAmount;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", friendsAmount=" + friendsAmount +
                '}';
    }
}
