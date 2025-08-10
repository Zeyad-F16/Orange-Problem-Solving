package Problems;

import java.util.Scanner;

public class LuckyDivision {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] luckyNumbers = {
                4, 7, 44, 47, 74, 77,
                444, 447, 474, 477,
                744, 747, 774, 777
        };

        boolean isAlmostLucky = false;
        for (int lucky : luckyNumbers) {
            if (n % lucky == 0) {
                isAlmostLucky = true;
                break;
            }
        }

        System.out.println(isAlmostLucky ? "YES" : "NO");
    }
}
