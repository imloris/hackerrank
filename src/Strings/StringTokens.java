package Strings;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] texto = s.split("[^a-zA-Z]+");
            System.out.println(texto.length);
            for (String index : texto) {
                System.out.println(index);
            }
        }

        scan.close();
    }
}


