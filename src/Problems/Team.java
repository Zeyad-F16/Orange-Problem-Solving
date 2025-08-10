package Problems;

import java.util.Scanner;

public class Team {

    public static void run(){

        int n ;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int f1 , f2 , f3;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            f1 = input.nextInt();
            f2 = input.nextInt();
            f3 = input.nextInt();
            if(f1 + f2 + f3 >= 2 )  ans++;
        }

        System.out.println(ans);
    }

}
