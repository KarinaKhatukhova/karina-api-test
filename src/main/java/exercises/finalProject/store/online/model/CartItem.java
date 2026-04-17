package exercises.finalProject.store.online.model;

public class CartItem {
    private Drink drink;
    private Short count;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Short getCount() {
        return count;
    }

    public void setCount(Short count) {
        this.count = count;
    }
}
