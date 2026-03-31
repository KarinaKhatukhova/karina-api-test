package exercises.car2;

public class CarNew {
    private String model;
    private Integer year;

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public CarNew(String model, Integer year) {
        this.model = (model != null) ? model : "Unknown";
        this.year = (year != null) ? year : 0;
    }

    @Override
    public String toString() {
        return "CarNew(model='" + model + "', year=" + year + ")";
    }


}
