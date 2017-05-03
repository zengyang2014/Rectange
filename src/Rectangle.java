/**
 * Created by yzeng on 03/05/2017.
 */
public class Rectangle {

    private double height;
    private double width;
    private static final int MIN_HEIGHT = 0;
    private static final int MIN_WIDTH = 0;

    public Rectangle(double newHeight, double newWidth) {
        if (newHeight <= MIN_HEIGHT && newWidth <= MIN_WIDTH) {
            this.width = -newWidth;
            this.height = -newHeight;
        } else {
            this.width = newWidth;
            this.height = newHeight;
        }
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }

    public double getHeight() {
        return height;
    }
}
