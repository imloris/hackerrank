package DataStructures;

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int j = i;
            while (j < arr.length) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
                j++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
