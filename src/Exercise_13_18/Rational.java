package Exercise_13_18;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private static final BigInteger ZERO = new BigInteger("0");
    private static final BigInteger ONE = new BigInteger("1");
    private static final BigInteger NEG_ONE = new BigInteger("-1");
    private BigInteger numerator = ZERO;
    private BigInteger denominator = ONE;

    /** Construct a rational with default properties */
    public Rational(){
        this(ZERO, ONE);
    }

    /** Construct a rational with specified numerator and denominator */
    public Rational(BigInteger numerator, BigInteger denominator){
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = ((denominator.compareTo(ZERO) == 1) ? ONE : NEG_ONE).multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    /** Find GCD of two numbers */
    private static BigInteger gcd(BigInteger n, BigInteger d){
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = ONE;

        for (BigInteger k = ONE; (k.compareTo(n1) == -1 || k.equals(n1)) && (k.compareTo(n2) == -1 || k.equals(n2)); k = k.add(ONE)) {
            if (n1.remainder(k).equals(ZERO) && n2.remainder(k).equals(ZERO))
                gcd = k;
        }
        return gcd;
    }

    /** Return numerator */
    public BigInteger getNumerator(){
        return numerator;
    }

    /** Return denominator */
    public BigInteger getDenominator(){
        return denominator;
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational){
        BigInteger n = (numerator.multiply(secondRational.getDenominator())).add((denominator.multiply(secondRational.getNumerator())));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational){
        BigInteger n = (numerator.multiply(secondRational.getDenominator())).subtract((denominator.multiply(secondRational.getNumerator())));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Multiply a rational number from this rational */
    public Rational multiply(Rational secondRational){
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Divide a rational number from this rational */
    public Rational divide(Rational secondRational){
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = numerator.multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString(){
        if (denominator.equals(ONE))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals (Object other){
        if ((this.subtract((Rational)(other))).getNumerator().equals(ZERO))
            return true;
        else
            return false;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int)doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long)doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override // Implement the abstract doubleValue method in Number
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().compareTo(ZERO) == 1)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(ZERO) == -1)
            return -1;
        else
            return 0;
    }
}
