package exercises.finalProject.store.online.model;


import exercises.finalProject.store.online.model.enumeration.*;

import java.math.BigDecimal;

public class Tea extends Drink {

    private TeaType teaType;
    private Aroma aroma;

    public Tea(String name, BigDecimal price, Float weight,
                  Manufacturer manufacturer, Country country, MyPackage mypackage,
               TeaType teaType, Aroma aroma) {
        super(name, price, weight, manufacturer, country, mypackage);
        this.teaType = teaType;
        this.aroma = aroma;
    }

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
