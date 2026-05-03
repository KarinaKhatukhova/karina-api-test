package exercises.finalProject.store.online.model;

import exercises.finalProject.store.online.model.enumeration.Country;
import exercises.finalProject.store.online.model.enumeration.Manufacturer;
import exercises.finalProject.store.online.model.enumeration.MyPackage;

import java.math.BigDecimal;

public abstract class Drink {
    private final String name;
    private final BigDecimal price;
    private final Float weight;
    private final Manufacturer manufacturer;
    private final Country country;
    private final MyPackage mypackage;

    protected Drink(String name, BigDecimal price, Float weight, Manufacturer manufacturer, Country country, MyPackage mypackage) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The drink name cannot be empty");
        }

        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("The price cannot be negative or greater than 0:: " + price);
        }

        if (weight == null || weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0: " + weight);
        }

        if (manufacturer == null) {
            throw new IllegalArgumentException("Manufacturer cannot be null");
        }
        if (country == null) {
            throw new IllegalArgumentException("Country cannot be null");
        }
        if (mypackage == null) {
            throw new IllegalArgumentException("Packaging cannot be null");
        }

        this.name = name;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.country = country;
        this.mypackage = mypackage;
    }

    public String getName() { return name; }
    public BigDecimal getPrice() { return price; }
    public Float getWeight() { return weight; }
    public Manufacturer getManufacturer() { return manufacturer; }
    public Country getCountry() { return country; }
    public MyPackage getMyPackage() { return mypackage; }

}
