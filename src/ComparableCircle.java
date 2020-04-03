public class ComparableCircle extends Circle {

    public ComparableCircle() {
    }

    /** Construct a CoparableCircle with specified radius */
    public ComparableCircle(double radius) {
        super(radius);
    }


    @Override // Implement the toString method defined in Circle
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }
}