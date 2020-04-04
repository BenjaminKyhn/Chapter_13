package Exercise_13_22;

public class ComparableSquare extends GeometricObject implements Comparable<ComparableSquare> {
    private double side;

    public ComparableSquare() {
    }

    public ComparableSquare(double side) {
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

    @Override
    public int compareTo(ComparableSquare o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}