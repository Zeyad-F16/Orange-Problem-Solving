package Problems;

import java.util.Scanner;

public class Watermelon {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
