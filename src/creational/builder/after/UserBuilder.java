package creational.builder.after;

public class UserBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public UserBuilder() {}

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber =phoneNumber;
        return this;
    }

    public UserBuilder withAge(int age) {
        this.age=age;
        return this;
    }

    public User build(){
        User user = new User(firstName,lastName,age,phoneNumber);
        validateUserObjects(user);
        return user;
    }

    private void validateUserObjects(User user) {
        // validate if user object does not break any system assumption
    }
}
