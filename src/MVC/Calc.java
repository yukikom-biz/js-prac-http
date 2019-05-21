package MVC;

public class Calc  {
    public static double calcLength(int radius) {
        return radius * Math.PI;
    }

    public static double calcSurface(int radius) {
        return radius * radius * Math.PI;
    }
}
