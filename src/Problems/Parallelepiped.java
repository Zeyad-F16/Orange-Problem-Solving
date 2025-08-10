package Problems;

import java.util.Scanner;

public class Parallelepiped {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int ca = sc.nextInt();

        double a = Math.sqrt((1.0 * ab * ca) / bc);
        double b = Math.sqrt((1.0 * ab * bc) / ca);
        double c = Math.sqrt((1.0 * bc * ca) / ab);

        int sumOfEdges = (int)(4 * (a + b + c));
        System.out.println(sumOfEdges);
    }
}
