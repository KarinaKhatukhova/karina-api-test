package exercises.interfaces.breakable;

public interface Flameable {
    private void defaultCalled() {
        System.out.println("Default is called for Flameable");
    }

    default boolean objectIsFlameable() {
        defaultCalled();
        return true;
    }
}
