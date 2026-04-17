package exercises.finalProject.store.online.model;

import exercises.finalProject.store.online.model.enumeration.Country;
import exercises.finalProject.store.online.model.enumeration.Manufacturer;
import exercises.finalProject.store.online.model.enumeration.MyPackage;

import java.math.BigDecimal;

public abstract class Drink {
    private String name;
    private BigDecimal price;
    private Float weight;
    private Manufacturer manufacturer;
    private Country country;
    private MyPackage mypackage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public MyPackage getPackage() {
        return mypackage;
    }

    public void setPackage(MyPackage mypackage) {
        this.mypackage = mypackage;
    }

}
