package Builder;

public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String state;

    @Override
    public String toString() {
        return houseNumber + ", " + street + ", " + city + ", " + state;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
