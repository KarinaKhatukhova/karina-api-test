package exercises.car2;

public class CarNew {
    private final String model;
    private final Integer year;

    public CarNew(String model, Integer year) {
        this.model = (model != null) ? model : "Unknown";
        this.year = (year != null) ? year : 0;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "CarNew(model='" + model + "', year=" + year + ")";
    }


}
