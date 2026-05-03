package exercises.finalProject.store.online.model;

import java.math.BigDecimal;

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
        if (count == null || count < 1) {
            throw new IllegalArgumentException(
                    "The quantity of the product must be > 0. Сount: " + count
            );
        }
        this.count = count;
    }

    public BigDecimal getTotalPrice() {
        if (drink == null || count == null || count < 1) {
            return BigDecimal.ZERO;
        }
        BigDecimal price = drink.getPrice();
        return price.multiply(BigDecimal.valueOf(count));
    }
}
