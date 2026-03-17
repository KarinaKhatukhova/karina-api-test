package exercises.Automobile;

public class Engine {
    private int power;
    private String manufacturer;


    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Motor: " + manufacturer + ", Power: " + power + " hp.";
    }
}
