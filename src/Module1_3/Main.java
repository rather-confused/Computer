package Module1_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(3, 6, 9));
        shapes.add(new Circle(6));
        shapes.add(new Triangle(6, 8, 10));

        for (TwoDShape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.getArea());
            System.out.println(shape);
        }

    }
}
