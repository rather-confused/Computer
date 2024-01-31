package module1_4;

public class Circle extends TwoDShape {

    public final double PI = Math.PI;
    private final double radius;

//using radius and color make a circle

    public Circle(double radius, Colour colour) {
        //radius is half width/length
        super(2 * radius, 2 * radius, colour);
        this.radius = radius;
    }

    // area of the circle
    @Override
    public double getArea() {
        if (radius <= 0.0) {
            return 0;
        }
        return PI * Math.pow(radius, 2);
    }

    //circle in string form
    @Override
    public String toString() {
        return "Circle{" +
                "width=" + super.getWidth() +
                ", height=" + super.getHeight() +
                ", colour=" + super.getColour() +
                ", PI=" + PI +
                ", radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}