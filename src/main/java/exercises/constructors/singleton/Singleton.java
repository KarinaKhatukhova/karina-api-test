package exercises.constructors.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("An instance Singleton has been created");
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("Performing an operation on an instance " + this.hashCode());
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
