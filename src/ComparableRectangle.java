public class ComparableRectangle extends Rectangle {
    /**
     * Construct a ComparableRectangle with the specified properties
     */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override // Implement the toString method in GeometricObject
    public String toString(){
        return super.toString() + " Area: " + getArea();
    }
}
