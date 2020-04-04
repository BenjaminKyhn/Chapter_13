public class Exercise_13_12 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(3);
        geometricObjects[1] = new Circle(9);
        geometricObjects[2] = new Rectangle(7, 6);
        geometricObjects[3] = new Rectangle(4.5, 5);
        System.out.println(sumArea(geometricObjects));
    }

    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
