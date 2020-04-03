import java.math.BigInteger;
import java.util.Arrays;

public class Listing_13_08 {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities)
            System.out.println(city + " ");
            System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"), new BigInteger("432232323239292"),
                new BigInteger("54623239292")};
        Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers)
            System.out.println(number + " ");
    }
}