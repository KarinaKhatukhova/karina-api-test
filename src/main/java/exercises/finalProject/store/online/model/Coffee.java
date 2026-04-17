package exercises.finalProject.store.online.model;


import exercises.finalProject.store.online.model.enumeration.CoffeeType;
import exercises.finalProject.store.online.model.enumeration.Roasting;

public class Coffee extends Drink {

    private CoffeeType coffeeType;
    private Roasting roasting;

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
