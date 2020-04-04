package Exercise_13_19;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = "";
        while(!n.matches("\\-?\\d+\\.\\d+")){
            System.out.println("Enter a decimal number :");
            n = input.next();
        }

        boolean negative = n.charAt(0) == '-';
        BigInteger[] numberComponents = parseInput(n);
        BigInteger denominator = numberComponents[2];
        BigInteger numerator = numberComponents[0].multiply(denominator).add(numberComponents[1]);
        Rational r = new Rational(numerator, denominator);

        System.out.println("The fraction number is " + (negative ? "-" : "") + r);
    }

    public static BigInteger[] parseInput(String s){
        String[] numberComponents = s.split("\\.");
        String  denomString = "1";
        for (int i = 0; i < numberComponents[1].length(); i++) {
            denomString += "0";
        }
        BigInteger characteristic = new BigInteger(numberComponents[0]);
        BigInteger mantissa = new BigInteger(numberComponents[1]);
        BigInteger denominator = new BigInteger(denomString);
        return new BigInteger[]{characteristic, mantissa, denominator};
    }
}
