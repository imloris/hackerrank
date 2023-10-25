package BigDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        if (new java.math.BigInteger(n).isProbablePrime(1))
            System.out.println("prime");
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}
