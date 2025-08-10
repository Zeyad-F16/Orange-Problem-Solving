package Problems;

import java.util.Scanner;

public class GroupOfStudents {
     public static void run(){

         Scanner sc = new Scanner(System.in);

         int m = sc.nextInt();
         int[] c = new int[m + 1];

         for (int i = 1; i <= m; i++) {
             c[i] = sc.nextInt();
         }

         int x = sc.nextInt();
         int y = sc.nextInt();

         for (int k = 1; k <= m; k++) {
             int beginners = 0;
             int intermediate = 0;

             for (int i = 1; i < k; i++) {
                 beginners += c[i];
             }

             for (int i = k; i <= m; i++) {
                 intermediate += c[i];
             }

             if (beginners >= x && beginners <= y && intermediate >= x && intermediate <= y) {
                 System.out.println(k);
                 return;
             }
         }

         System.out.println(0);
     }
}
