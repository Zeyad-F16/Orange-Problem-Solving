package Problems;

import java.util.Scanner;

public class VasyaAndDigitalRoot {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int d = sc.nextInt();

        if (d == 0) {
            if (k == 1)
                System.out.println(0);
            else
                System.out.println("No solution");
        } else {
            System.out.print(d);
            for (int i = 1; i < k; i++)
                System.out.print(0);
            System.out.println();
        }
    }
}
