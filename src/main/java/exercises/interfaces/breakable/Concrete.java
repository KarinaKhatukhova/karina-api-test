package exercises.interfaces.breakable;

public class Concrete implements Breakable, Flameable {
    @Override
    public boolean objectIsBreakable() {
        return false;
    }

    @Override
    public boolean objectIsFlameable() {
        return false;
    }
}
