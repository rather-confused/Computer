package Module1_4;

public class Triangle extends TwoDShape implements Rotate {

    double side1;
    double side2;
    double side3;
    private double angle = 0;

//creates a triangle with the parameters we give it
    public Triangle(double width, double height, Colour colour) {
        super(width, height, colour);
    }

    //creates triangle with diff parameters
    public Triangle(double side1, double side2, double side3, Colour colour) {
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setWidth(side1);
        setHeight(heronsHeight());
    }

    //using herons formula solve for the height of triangle
    private double heronsHeight() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return 0;
        }

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        if (area <= 0 || Double.isNaN(area)) {
            return 0;
        }

        double h = 2 * area / super.getWidth();
        return h;
    }

    // half base times height to get area
    @Override
    public double getArea() {
        if (super.getWidth() <= 0 || super.getHeight() <= 0) {
            return 0; // A triangle with a negative or zero base or height has no area
        }
        return 0.5 * super.getWidth() * super.getHeight();
    }

    //string version of triangle
    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + super.getWidth() +
                ", height=" + super.getHeight() +
                ", colour=" + super.getColour() +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + getArea() +
                ", angle=" + angle +
                '}';
    }

    //rotate 90 degrees
    @Override
    public void rotate90() {
        rotate(90);
    }

    //rotate 180 degrees
    @Override
    public void rotate180() {
        rotate(180);
    }

    //rotate by *degree* degrees
    @Override
    public void rotate(double degree) {
        angle += degree;
        // Ensure that angle is 0 <= angle < 360
        angle %= 360;
    }
}