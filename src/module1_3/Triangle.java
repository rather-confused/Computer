package module1_3;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    private double angle = 0;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setWidth(side1);
        setHeight(heronsHeight());
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

        double h = 2 * area / super.getWidth();
        return h;
    }

    @Override
    public double getArea() {
        if (super.getWidth() <= 0 || super.getHeight() <= 0) {
            return 0;
        }
        return 0.5 * super.getWidth() * super.getHeight();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + super.getWidth() +
                ", height=" + super.getHeight() +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + getArea() +
                ", angle=" + angle +
                '}';
    }

    @Override
    public void rotate90() {
        rotate(90);
    }

    @Override
    public void rotate180() {
        rotate(180);
    }

    @Override
    public void rotate(double degree) {
        angle += degree;
        angle %= 360;
    }
}