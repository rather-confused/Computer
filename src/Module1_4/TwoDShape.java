package Module1_4;

public abstract class TwoDShape {
    private double width;
    private double height;
    private Colour colour;

    //create shape with parameters
    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    //create shape with given colour, only colour set
    public TwoDShape(Colour colour) {
        this.colour = colour;
    }

    //width of shape
    public double getWidth() {
        return width;
    }

    //set width of shape
    public void setWidth(double width) {
        this.width = width;
    }

    //height of shape
    public double getHeight() {
        return height;
    }

    //set height of shape
    public void setHeight(double height) {
        this.height = height;
    }

    //color of shape
    public Colour getColour() {
        return colour;
    }

    //set color of shape
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    //area of shape
    public abstract double getArea();

}