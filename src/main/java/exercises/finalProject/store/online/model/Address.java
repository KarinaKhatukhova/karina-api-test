package exercises.finalProject.store.online.model;

import exercises.finalProject.store.online.model.enumeration.Country;

public class Address {
    public final Country country;
    public final String region;
    public final String city;
    public final String street;
    public final String house;
    public final String apartment;
    public final String index;

    public Address(Country country, String region, String city,
                   String street, String house, String apartment, String index) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
        this.index = index;
    }
}
