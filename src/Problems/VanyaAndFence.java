package Problems;

import java.util.Scanner;

public class VanyaAndFence {

    public static void run(){
    int n , h;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    h = sc.nextInt();

    int f;
    int ans = 0;

        for(int i = 0 ; i < n ; i++){
        f = sc.nextInt();
        if (f <= h) ans++;
        else ans+=2;
    }

        System.out.println(ans);
    }

}
