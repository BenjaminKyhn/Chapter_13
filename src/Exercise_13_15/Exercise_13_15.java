package Exercise_13_15;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_13_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first rational number: ");
        Rational r1 = new Rational(new BigInteger(input.next()), new BigInteger(input.next()));
        System.out.println("Enter the second rational number: ");
        Rational r2 = new Rational(new BigInteger(input.next()), new BigInteger(input.next()));

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
