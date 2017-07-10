/**
 * Created by jenny on 7/9/2017.
 */

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

    public String getFormattedCircumference() {
        return formatNumber(this.getCircumference());
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public String getFormattedArea() {
        return formatNumber(this.getArea());
    }

    //Format numbers to the nearest 2 decimal places
    private String formatNumber(double x) {
        return String.format("%.2f", x);
    }
}
