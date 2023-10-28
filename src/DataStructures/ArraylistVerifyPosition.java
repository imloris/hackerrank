package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistVerifyPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> L = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < N; i++) {
            int D = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < D; j++) {
                temp.add(sc.nextInt());
            }
            L.add(temp);
        }

        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(L.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
