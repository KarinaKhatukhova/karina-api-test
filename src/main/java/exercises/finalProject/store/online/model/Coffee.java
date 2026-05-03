package exercises.finalProject.store.online.model;


import exercises.finalProject.store.online.model.enumeration.*;

import java.math.BigDecimal;

public class Coffee extends Drink {

    private CoffeeType coffeeType;
    private Roasting roasting;

    public Coffee(String name, BigDecimal price, Float weight,
                  Manufacturer manufacturer, Country country, MyPackage mypackage,
                  CoffeeType coffeeType, Roasting roasting) {
        super(name, price, weight, manufacturer, country, mypackage);
        this.coffeeType = coffeeType;
        this.roasting = roasting;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Roasting getRoasting() {
        return roasting;
    }
    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }
}
