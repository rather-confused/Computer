package module1_2;

public abstract class TwoDShape {
    private double width;
    private double height;
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public TwoDShape() {
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double getArea();

}