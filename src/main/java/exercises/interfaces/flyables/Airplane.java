package exercises.interfaces.flyables;

public class Airplane implements Flyable {
    @Override
    public String flyObj() {
        return "The plane flies in the atmosphere";
    }
}
