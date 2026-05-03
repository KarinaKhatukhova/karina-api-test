package exercises.interfaces.flyables;

public class Spacecraft implements Flyable {
    @Override
    public String flyObj() {
        return "The spaceship flies through space";
    }
}
