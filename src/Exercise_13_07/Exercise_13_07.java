package Exercise_13_07;

public class Exercise_13_07 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Square(6);
        geometricObjects[1] = new Triangle(4, 5, 9);
        geometricObjects[2] = new Rectangle(4, 8);
        geometricObjects[3] = new Square(5);
        geometricObjects[4] = new Circle(6);

        for (int i = 0; i < geometricObjects.length; i++) {
            System.out.println("Area is " + geometricObjects[i].getArea());
            if (geometricObjects[i] instanceof Colorable)
               ((Colorable)geometricObjects[i]).howToColor();
        }
    }
}
