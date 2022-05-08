package creational.builder.before;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("steve","jobs",48,"12345678");
        User user2 = new User("elon","musk","12345678");
        User user3 = new User("bill","gates",52);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
