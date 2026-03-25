package exercises.person2;

public class PersonNew {
    private String fullName;
    private Integer age;

    public PersonNew() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    public PersonNew(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " moves");
    }


    public void talk() {
        System.out.println(fullName + ", age " + age + " talks");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
