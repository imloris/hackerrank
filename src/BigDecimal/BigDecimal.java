package BigDecimal;

import java.util.Scanner;

public class BigDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        
        java.math.BigDecimal[] bd = new java.math.BigDecimal[n];
        for (int i = 0; i < n; i++) {
            bd[i] = new java.math.BigDecimal(s[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - (i + 1); j++) {
                if (bd[j].compareTo(bd[j + 1]) < 0) {
                    java.math.BigDecimal temp = bd[j];
                    bd[j] = bd[j + 1];
                    bd[j + 1] = temp;

                    String tempS = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tempS;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }
}
