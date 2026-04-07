package exercises.Automobile;

public class PersonAuto {
    private String fullName;
    private int age;

    public PersonAuto(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return fullName + " (age: " + age + ")";
    }
}
