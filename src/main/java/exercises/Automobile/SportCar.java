package exercises.Automobile;

public final class SportCar extends Car {
    private final double speed;

    public SportCar(String marka, String carClass, Driver driver, Engine engine, double speed) {
        super(marka, carClass, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Maximum speed: " + speed + " km/h";
    }

}
