package Sesstion;

import java.io.Serializable;

public class PlusBean implements Serializable {
    private String name,place,tell;

    public PlusBean(String name, String place, String tell) {
        this.name = name;
        this.place = place;
        this.tell = tell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
