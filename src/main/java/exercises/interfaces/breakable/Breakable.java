package exercises.interfaces.breakable;

public interface Breakable {
    private void defaultCalled() {
        System.out.println("Default is called for Breakable");
    }

    default boolean objectIsBreakable() {
        defaultCalled();
        return true;
    }
}
