package exercises.Automobile;

public class Car {
    private String marka;
    private String carClass;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String carClass, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }


    public String getMarka() {
        return marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Automobile: " + marka + "\n" +
                "Class: " + carClass + "\n" +
                "Driver: " + driver + "\n" +
                engine;
    }
}

