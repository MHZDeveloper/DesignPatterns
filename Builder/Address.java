package Builder;

public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String state;


    public Address(String houseNumber, String street, String city, String state) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return houseNumber + ", " + street + ", " + city + ", " + state;
    }
}
