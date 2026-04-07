package exercises.phone;

import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(Phone caller) {
        if (this.equals(caller)){
            System.out.println("Error: Phone can't call itself!");
        } else {
            System.out.println("Calls " + caller.getNumber());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Phone other = (Phone) obj;
        return this.weight == other.weight &&
                Objects.equals(this.number, other.number) &&
                Objects.equals(this.model, other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight + "g" +
                '}';
    }
}
