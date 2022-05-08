package creational.builder.after;

public class Main {

    public static void main(String[] args) {
//        User user1 = new User("steve","jobs",48,"12345678");
//        User user2 = new User("elon","musk","12345678");
//        User user3 = new User("bill","gates",52);

        User user1 = new UserBuilder()
                .withFirstName("steve")
                .withLastName("jobs")
                .withAge(48)
                .withPhoneNumber("12345678")
                .build();

        User user2 = new UserBuilder()
                .withFirstName("elon")
                .withLastName("musk")
                .withPhoneNumber("12345678")
                .build();

        User user3 = new UserBuilder()
                .withFirstName("bill")
                .withLastName("gates")
                .withAge(52)
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
