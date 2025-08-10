package Problems;

import java.util.Scanner;

public class Joysticks {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int minutes = 0;

        while (a1 > 0 && a2 > 0) {
            if (a1 == 1 && a2 == 1) break;

            if (a1 <= a2) {
                a1 += 1;
                a2 -= 2;
            } else {
                a2 += 1;
                a1 -= 2;
            }
            minutes++;
        }

        System.out.println(minutes);
    }
}
