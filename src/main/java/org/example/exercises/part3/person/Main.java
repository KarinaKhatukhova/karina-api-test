package org.example.exercises.part3.person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Anna";
        person1.age = 25;

        Person person2 = new Person();
        person2.name = "Ivan";
        person2.age = 30;

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}

class Person {
    public String name;
    public int age;
}
