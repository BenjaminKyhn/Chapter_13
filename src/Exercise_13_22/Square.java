package Exercise_13_22;

public class Square extends GeometricObject {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    /** Return area */
    public double getArea() {
        return side * side;
    }

    @Override
    /** Return perimeter */
    public double getPerimeter() {
        return 4 * side;
    }
}