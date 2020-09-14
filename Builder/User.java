package Builder;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    public User(String firstName, String lastName, LocalDate birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }
}
