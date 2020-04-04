// Note: this program has a very long run time

package Exercise_13_18;

import java.math.BigInteger;

public class Exercise_13_18 {
    public static void main(String[] args) {
        Rational sum = new Rational();
        for (int i = 1; i < 100; i = i + 2) {
            sum = sum.add(new Rational(new BigInteger(String.valueOf(i)), new BigInteger(String.valueOf(i + 1))));
        }

        System.out.println(sum.doubleValue());
    }
}
