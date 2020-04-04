package Exercise_13_09;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public int compareTo(Circle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }
        return radius == ((Circle) o).getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
