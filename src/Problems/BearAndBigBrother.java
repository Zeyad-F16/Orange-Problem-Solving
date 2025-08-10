package Problems;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void run(){
        int l , b;
        Scanner input = new Scanner(System.in);
        l = input.nextInt();
        b = input.nextInt();

        if(l == b){
            System.out.println("1");
            return;
        }

        int ans = 0;

        while(l <= b){
            l*=3;
            b*=2;
            ans++;
        }

        System.out.println(ans);

    }
}
