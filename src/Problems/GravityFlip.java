package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int space = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (space < n) System.out.print(" ");
        }
    }
}