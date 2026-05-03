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
