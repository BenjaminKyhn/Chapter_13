package Exercise_13_11;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon(){
        side = 0;
    }

    public Octagon(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        return (Octagon) super.clone();
    }
}
