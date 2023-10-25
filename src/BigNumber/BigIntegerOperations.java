package BigNumber;

import java.util.Scanner;

public class BigIntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger a = new java.math.BigInteger(sc.next());
        java.math.BigInteger b = new java.math.BigInteger(sc.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        sc.close();
    }
}
