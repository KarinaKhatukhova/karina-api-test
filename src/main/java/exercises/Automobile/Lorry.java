package exercises.Automobile;

public final class Lorry extends Car {
    private int carrying;

    public Lorry(String marka, String carClass, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Carrying: " + carrying + " kg";
    }
}