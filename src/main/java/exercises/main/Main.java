package exercises.main;

import exercises.bankAccount.BankAccount;
import exercises.bankAccount.SavingsAccount;
import exercises.part3.person.Person;
import exercises.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
//        demonstratePerson();
//        demonstrateRectangle();
//        demonstrateBankAccount();
        demonstrateSavingsAccount();
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
}

