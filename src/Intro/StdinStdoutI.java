package Intro;

import java.util.Scanner;

public class StdinStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.printf(a + "\n" + b + "\n" + c);
    }
}
