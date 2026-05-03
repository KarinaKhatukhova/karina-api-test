package exercises.constructors;


import exercises.constructors.car2.CarNew;
import exercises.constructors.person2.PersonNew;
import exercises.constructors.phone.Phone;
import exercises.constructors.rectangle2.RectangleNew;
import exercises.constructors.singleton.Singleton;

public class MainConstructors {
    private static void demonstrateCarNew() {

        CarNew car1 = new CarNew("Toyota Camry", 2022);
        CarNew car2 = new CarNew(null, null);

        System.out.println("First car: " + car1);
        System.out.println("Second car: " + car2);
    }

    private static void demonstratePersonNew() {

        PersonNew person1 = new PersonNew();

        PersonNew person2 = new PersonNew("Ivan Petrov", 25);

        System.out.println("=== Object 1 (created via PersonNew()) ===");
        person1.move();
        person1.talk();

        System.out.println("\n=== Object 2 (created via PersonNew(fullName, age)) ===");
        person2.move();
        person2.talk();

        System.out.println("\n=== Setting values for the first object ===");
        person1.setFullName("Anna Sidorova");
        person1.setAge(30);

        person1.move();
        person1.talk();
    }

    private static void demonstratePhone() {

        Phone phone1 = new Phone();
        phone1.setNumber("+7-999-123-45-67");
        phone1.setModel("iPhone 16 Pro");
        phone1.setWeight(187);

        Phone phone2 = new Phone();
        phone2.setNumber("+7-999-987-65-43");
        phone2.setModel("Samsung Galaxy S24");
        phone2.setWeight(196);

        System.out.println("=== Test 1: Calling another phone ===");
        phone1.receiveCall(phone2);

//        System.out.println("\n=== Test 2: Calling Yourself ===");
//        phone1.receiveCall(phone1);

        System.out.println("\n=== Information about phones ===");
        System.out.println("Phone 1: " + phone1);
        System.out.println("Phone 2: " + phone2);

        System.out.println("\n=== Examination equals и hashCode ===");
        System.out.println("phone1.equals(phone2): " + phone1.equals(phone2));
        System.out.println("phone1.hashCode() == phone2.hashCode(): " +
                (phone1.hashCode() == phone2.hashCode()));

        Phone phone3 = new Phone();
        phone3.setNumber("+7-999-123-45-67");
        phone3.setModel("iPhone 16 Pro");
        phone3.setWeight(187);

        System.out.println("\n=== Examination equals for the same data ===");
        System.out.println("phone1.equals(phone3): " + phone1.equals(phone3));
        System.out.println("phone1.hashCode() == phone3.hashCode(): " +
                (phone1.hashCode() == phone3.hashCode()));

    }

    private static void demonstrateRectangleNew() {
        RectangleNew rectangle1 = new RectangleNew(10, 20);
        RectangleNew rectangle2 = new RectangleNew(rectangle1);

        System.out.println("First rectangle: " + rectangle1);
        System.out.println("Second rectangle (copy): " + rectangle2);

        System.out.println("\nEquality Test: " + rectangle1.equals(rectangle2));
        System.out.println("HashCode of the first: " + rectangle1.hashCode());
        System.out.println("HashCode of the second: " + rectangle2.hashCode());
    }

    private static void demonstrateSingleton() {

        // Попытка создать экземпляр через конструктор невозможна:
        //Singleton s1 = new Singleton(); // Ошибка компиляции

        // Получаем экземпляр через статический метод
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Проверяем, что это один и тот же экземпляр
        System.out.println("instance1 and instance2 are equal: " + (instance1 == instance2));

        instance1.doSomething();
        instance2.doSomething();

    }

    public static void runConstructorsTasks() {
//        demonstrateCarNew();
//        demonstratePersonNew();
//        demonstratePhone();
//        demonstrateRectangleNew();
        demonstrateSingleton();
    }
}
