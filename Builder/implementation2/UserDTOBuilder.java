package Builder.implementation2;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
    //methods to build "parts" of product at a time
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //build final product
    UserDTO build();

    //(optional) method to fetch already built object
    UserDTO getUserDTO();
}

