public class Exercise_13_05 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(11.5);
        Rectangle rectangle1 = new Rectangle(2, 5);
        Rectangle rectangle2 = new Rectangle(4, 3);

        System.out.println("The larger circle is " + Circle.max(circle1, circle2));
        System.out.println("The larger rectangle is " + Rectangle.max(rectangle1, rectangle2));
    }

    // Displays a string
    public static void print(String s) {
        System.out.println(s);
    }

    // Displays a GeometricObject
    public static void print(GeometricObject o) {
        System.out.println(o);
    }
}
