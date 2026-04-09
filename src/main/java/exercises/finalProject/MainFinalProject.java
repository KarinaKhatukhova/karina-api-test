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
        Address address = new Address();

        address.setCountry(Country.CHINA);
        address.setCity("TestCity");
        address.setRegion("TestRegion");
        address.setHouse("testHouse");
        address.setIndex("testIndex");
        address.setStreet("testStreet");
        address.setApartment("testApartment");

        return address;
    }

    public static Coffee createCoffeeObject() {
        Coffee coffee = new Coffee();

        coffee.setName("TestCoffee");
        coffee.setPrice(BigDecimal.valueOf(250.00));
        coffee.setWeight(0.25f);
        coffee.setManufacturer(Manufacturer.NESCAFE);
        coffee.setCountry(Country.BRAZIL);
        coffee.setPackage(MyPackage.PAPER);
        coffee.setRoasting(Roasting.MEDIUM);
        coffee.setCoffeeType(CoffeeType.GROUND);

        return coffee;
    }

    public static Tea createTeaObject() {
        Tea tea = new Tea();

        tea.setPackage(MyPackage.BOX);
        tea.setName("TestTea");
        tea.setCountry(Country.CHINA);
        tea.setManufacturer(Manufacturer.LIPTON);
        tea.getTeaType(TeaType.BERRY);
        tea.setPrice(BigDecimal.valueOf(150.00));
        tea.setAroma(Aroma.FRUIT);
        tea.setWeight(0.25f);

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
        BigDecimal total = calculateTotalPrice(createCartItem);
        order.setTotalPrice(total);
        order.setCartItemArray(createCartItem);

        return order;
    }

    private static BigDecimal calculateTotalPrice(CartItem[] cartItems) {
        BigDecimal total = BigDecimal.ZERO;

        for (CartItem item : cartItems) {
            BigDecimal itemPrice = item.getDrink()
                    .getPrice()
                    .multiply(BigDecimal.valueOf(item.getCount()));
            total = total.add(itemPrice);
        }

        return total;
    }

    public static void getOrderInfo() {
        Order orderInfo = createOrder();

        System.out.println("\n*** Order info *** ");
        System.out.println("Order create date: " + orderInfo.getOrderDate());
        System.out.println("Order customer: " + orderInfo.getUser().getName() + " " + orderInfo.getUser().getLastName());
        System.out.println("Order address: City: " + orderInfo.getAddress().getCity() + ", Street: " + orderInfo.getAddress().getStreet());
        System.out.println("Order status: " + orderInfo.getStatus());
        System.out.println("Order list:\n");
        for(CartItem item : orderInfo.getCartItemArray()) {
            System.out.println("Drink: " + item.getDrink().getName() + ", count: " + item.getCount());
        }
        System.out.println("\nOrder total Price: " + orderInfo.getTotalPrice());
    }

}
