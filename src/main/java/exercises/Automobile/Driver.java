package exercises.Automobile;

public class Driver extends PersonAuto {
    private int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return super.toString() + ", driving experience: " + drivingExperience + " years";
    }
}

