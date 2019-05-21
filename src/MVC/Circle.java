package MVC;

import java.io.Serializable;

//This is Model File
public class Circle implements Serializable {
    private int radius;
    private String calcType;
    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Circle(int radius, String calcType, double result) {
        this.radius = radius;
        this.calcType = calcType;
        this.result = result;
    }

    Circle(int radius, String calcType) {
        this.radius = radius;
        this.calcType = calcType;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

}
