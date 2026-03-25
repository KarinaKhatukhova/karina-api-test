package exercises;

import exercises.bankAccount.BankAccount;
import exercises.bankAccount.SavingsAccount;
import exercises.part3.person.Person;
import exercises.person2.PersonNew;
import exercises.phone.Phone;
import exercises.rectangle.Rectangle;
import exercises.calculator.Calculator;
import exercises.studentAspirant.Aspirant;
import exercises.studentAspirant.Student;
import exercises.Automobile.Car;
import exercises.Automobile.Driver;
import exercises.Automobile.Engine;
import exercises.Automobile.Lorry;
import exercises.Automobile.SportCar;



public class Main {
    public static void main(String[] args) {
//        demonstratePerson();
//        demonstrateRectangle();
//        demonstrateBankAccount();
//        demonstrateSavingsAccount();
//        demonstrateCalculator();
//        demonstrateStudentAspirant();
//        demonstrateAutomobile();
//        demonstratePhone();
          demonstratePersonNew();
    }

    private static void demonstratePerson() {
        Person person1 = new Person();
        person1.setName("Anna");
        person1.setAge(25);

        Person person2 = new Person();
        person2.setName("Ivan");
        person2.setAge(30);

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        System.out.println("\nPerson 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }

    private static void demonstrateRectangle() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(7.5);
        rectangle1.setHeight(4.2);

        System.out.println("Rectangle 1:");
        System.out.println("Rectangle: Width = " + rectangle1.getWidth() +
                ", Height = " + rectangle1.getHeight() +
                ", Area = " + rectangle1.calculateArea() +
                ", Perimeter = " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(5.5);
        rectangle2.setHeight(4.5);

        System.out.println("Rectangle 2:");
        System.out.println("Rectangle: Width = " + rectangle2.getWidth() +
                ", Height = " + rectangle2.getHeight() +
                ", Area = " + rectangle2.calculateArea() +
                ", Perimeter = " + rectangle2.calculatePerimeter());
    }

    private static void demonstrateBankAccount() {
        BankAccount account = new BankAccount(500);
        System.out.println("An account with a balance of 500 was created.");

        account.printBalance();

        account.deposit(200);
        account.withdraw(100);
//        account.withdraw(700); // попытка снять больше, чем есть
//        account.withdraw(-50); // некорректная операция

        account.printBalance();
    }

    private static void demonstrateSavingsAccount() {
        SavingsAccount savings = new SavingsAccount(500);
        System.out.println("A savings account with a balance of 500 was created.");

        savings.printBalance();

        savings.deposit(150);
        savings.withdraw(200); // должно сработать (500 + 150 - 200 = 450, > 100)

        System.out.println();
        savings.withdraw(400); // должно быть отклонено (450 - 400 = 50, < 100)

        System.out.println();
        savings.withdraw(300); // 450 - 300 = 150, > 100
        savings.printBalance();
    }

    private static void demonstrateCalculator() {
        Calculator calc = new Calculator();

        calc.multiply(5, 3);
        calc.multiply(4, 2.5);
        calc.multiply(3.5, 2.0);
    }

    private static void demonstrateStudentAspirant() {
        Student student = new Student("Ivan", "Petrov", "IT-101", 4.8);
        System.out.println("Student: " + student.firstName + " " + student.lastName);
        System.out.println("Student scholarship: " + student.getScholarship());


        Student excellentStudent = new Student("Maria", "Ivanova", "IT-101", 5.0);
        System.out.println("\nStudent: " + excellentStudent.firstName + " " + excellentStudent.lastName);
        System.out.println("Student scholarship: " + excellentStudent.getScholarship());

        Aspirant aspirant = new Aspirant("Alexey", "Sidorov", "ASP-201", 4.7, "Artificial intelligence");
        System.out.println("\nAspirant: " + aspirant.firstName + " " + aspirant.lastName);
        System.out.println("Research work: " + aspirant.getResearchWork());
        System.out.println("Aspirant scholarship: " + aspirant.getScholarship());

        Aspirant excellentAspirant = new Aspirant("Elena", "Smirnova", "ASP-201", 5.0, "Neural networks");
        System.out.println("\nAspirant: " + excellentAspirant.firstName + " " + excellentAspirant.lastName);
        System.out.println("Research work: " + excellentAspirant.getResearchWork());
        System.out.println("Aspirant scholarship: " + excellentAspirant.getScholarship());
    }

    private static void demonstrateAutomobile() {
        Driver driver = new Driver("Ivanov Ivan Ivanovich", 35, 12);

        Engine engine = new Engine(150, "Toyota");

        Car car = new Car("Toyota Camry", "sedan", driver, engine);

        System.out.println("=== An ordinary car ===");
        System.out.println(car);
        System.out.println("\nActions:");
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();

        Driver truckDriver = new Driver("Petrov Petr Petrovich", 42, 18);
        Engine truckEngine = new Engine(400, "Volvo");
        Lorry lorry = new Lorry("Volvo FH", "Cargo", truckDriver, truckEngine, 20000);

        System.out.println("\n=== truck ===");
        System.out.println(lorry);
        System.out.println("\nActions:");
        lorry.start();
        lorry.turnLeft();
        lorry.stop();

        Driver sportDriver = new Driver("Sidorov Alexey Vladimirovich", 28, 5);
        Engine sportEngine = new Engine(600, "Ferrari");
        SportCar sportCar = new SportCar("Ferrari F8", "Sportcar", sportDriver, sportEngine, 340.5);

        System.out.println("\n=== Sportcar ===");
        System.out.println(sportCar);
        System.out.println("\nActions:");
        sportCar.start();
        sportCar.turnRight();
        sportCar.turnRight();
        sportCar.stop();
    }

    public static void demonstratePhone() {

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

    public static void demonstratePersonNew() {

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

}


