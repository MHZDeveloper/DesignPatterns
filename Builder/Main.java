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
        Address address = new Address();
        address.setHouseNumber("12");
        address.setStreet("Liberty");
        address.setCity("San Diego");
        address.setState("California");
        User user = new User();
        user.setAddress(address);
        user.setBirthday(LocalDate.now());
        user.setFirstName("Harry");
        user.setLastName("Potter");
        return user;
    }
}
