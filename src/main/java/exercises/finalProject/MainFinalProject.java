package exercises.finalProject;

import exercises.finalProject.store.online.model.*;
import exercises.finalProject.store.online.model.enumeration.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MainFinalProject {
    public static User createUserObject() {
        User user = new User();

        user.setName("Test");
        user.setLastName("Testov");
        user.setPhoneNumber("+71234567");
        user.setMail("test@test.test");
        user.setLogin("TestLogin");
        user.setPassword("TestPassword");
        user.setRole(Role.CUSTOMER);

        return user;
    }

    public static Address createAddressObject() {
        Address address = new Address(Country.CHINA, "TestRegion", "TestCity",
                "testStreet", "testHouse", "testApartment", "testIndex");

        return address;
    }

    public static Coffee createCoffeeObject() {
        Coffee coffee = new Coffee(
                "TestCoffee",
                BigDecimal.valueOf(250),
                0.35f,
                Manufacturer.NESCAFE,
                Country.BRAZIL,
                MyPackage.PAPER,
                CoffeeType.GROUND,
                Roasting.MEDIUM
        );

        return coffee;
    }

    public static Tea createTeaObject() {
        Tea tea = new Tea(
                "TestTea",
                BigDecimal.valueOf(250),
                0.15f,
                Manufacturer.LIPTON,
                Country.CHINA,
                MyPackage.BOX,
                TeaType.BERRY,
                Aroma.FRUIT
        );

        return tea;
    }

    public static CartItem[] createCartItem() {
        CartItem coffeItem = new CartItem();
        CartItem teaItem = new CartItem();
        Coffee coffeeInfo = createCoffeeObject();
        Tea teaInfo = createTeaObject();

        coffeItem.setDrink(coffeeInfo);
        coffeItem.setCount((short) 5);
        teaItem.setDrink(teaInfo);
        teaItem.setCount((short) 2);

        CartItem[] cartItems = {coffeItem, teaItem};
        return cartItems;
    }

    public static Order createOrder() {
        Address address = createAddressObject();
        User user = createUserObject();

        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setAddress(address);
        order.setStatus(Status.NEW);
        order.setUser(user);

        CartItem[] createCartItem = createCartItem();
        BigDecimal total = order.calculateTotalPrice(createCartItem);
        order.setTotalPrice(total);
        order.setCartItemArray(createCartItem);

        return order;
    }

    public static void getOrderInfo() {
        Order orderInfo = createOrder();

        System.out.println("\n*** Order info *** ");
        System.out.println("Order create date: " + orderInfo.getOrderDate());
        System.out.println("Order customer: " + orderInfo.getUser().getName() + " " + orderInfo.getUser().getLastName());
        System.out.println("Order address: City: " + orderInfo.getAddress().city + ", Street: " + orderInfo.getAddress().street);
        System.out.println("Order status: " + orderInfo.getStatus());
        System.out.println("Order list:\n");
        for (CartItem item : orderInfo.getCartItemArray()) {
            System.out.println("Drink: " + item.getDrink().getName() + ", count: " + item.getCount());
        }
        System.out.println("\nOrder total Price: " + orderInfo.getTotalPrice());
    }

}
