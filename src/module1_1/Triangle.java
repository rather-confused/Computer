package module1_1;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.width = side1;
        super.height = heronsHeight();
    }

    private double heronsHeight() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return 0;
        }
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        if (area <= 0 || Double.isNaN(area)) {
            return 0;
        }

        double h = 2 * area / super.width;
        return h;
    }

    @Override
    public double getArea() {
        if (super.width <= 0 || super.height <= 0) {
            return 0;
        }
        return 0.5 * super.width * super.height;
    }
}