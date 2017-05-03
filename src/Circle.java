/**
 * Created by yzeng on 03/05/2017.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {

        this.radius = Math.abs(radius);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
