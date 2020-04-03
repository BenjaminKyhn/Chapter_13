import java.util.Scanner;

public class Exercise_13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle: ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Enter a colour for the triangle: ");
        triangle.setColor(input.next());
        System.out.println("Enter a boolean for filled: ");
        triangle.setFilled(input.nextBoolean());

        System.out.println("The triangle's area is " + triangle.getArea() + " and its perimeter is " + triangle.getPerimeter());
        System.out.println("Its color is " + triangle.getColor() + " and its fill is " + triangle.isFilled());
    }
}
