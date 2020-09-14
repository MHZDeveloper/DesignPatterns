package Builder;

import java.time.LocalDate;
import java.time.Period;

public class UserDto {

    private String name;
    private String age;
    private String address;

    private UserDto(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static UserDtoBuilder getBuilder() {
        return new UserDtoBuilder();
    }

    @Override
    public String toString() {
        return "name : " + name + "; age : " + age + "; address : " + address;
    }

    public static class UserDtoBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDto userDto;

        public UserDtoBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDtoBuilder withAddress(Address address) {
            this.address = address.toString();
            return this;
        }

        public UserDto build() {
            String name = firstName + " " + lastName;
            this.userDto = new UserDto(name, age, address);
            return this.userDto;
        }

        public UserDto getUserDto() {
            return this.userDto;
        }

    }
}
