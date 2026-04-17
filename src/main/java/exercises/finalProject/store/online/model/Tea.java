package exercises.finalProject.store.online.model;


import exercises.finalProject.store.online.model.enumeration.Aroma;
import exercises.finalProject.store.online.model.enumeration.TeaType;

public class Tea extends Drink {

    private TeaType teaType;
    private Aroma aroma;

    public void getTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }
}
