package Builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User user = createUser();
        UserDto userDto = UserDto.getBuilder()
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress()).build();

        System.out.println(userDto.toString());
    }

    public static User createUser() {
        Address address = new Address("12", "liberty", "san diego", "california");
        return new User("harry", "potter", LocalDate.now(), address);
    }
}
