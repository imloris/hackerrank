package Strings;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        String auxA = a.toLowerCase();
        String auxB = b.toLowerCase();

        int[] count = new int[256];
        for (int i = 0; i < auxA.length(); i++) {
            count[auxA.charAt(i)]++;
            count[auxB.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
