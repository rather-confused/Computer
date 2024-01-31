package module1_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(3, 6, 9, Colour.RED));
        shapes.add(new Circle(6, Colour.NONE));
        shapes.add(new Triangle(6, 8, 10, Colour.GREEN));


        for (TwoDShape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.getArea());
            System.out.println(shape);
        }

    }
}