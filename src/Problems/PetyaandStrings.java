package Problems;

import java.util.Scanner;

public class PetyaandStrings {
    public static void run(){

        Scanner sc = new Scanner(System.in);

        String s1 , s2;
        s1 = sc.nextLine().toLowerCase();
        s2 = sc.nextLine().toLowerCase();

        int x = s1.compareTo(s2);

        if(x < 0) System.out.println("-1");
        else if(x == 0) System.out.println("0");
        else System.out.println("1");

    }
}
