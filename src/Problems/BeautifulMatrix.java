package Problems;

import java.util.Scanner;

import static java.lang.Math.abs;

public class BeautifulMatrix {
    public static void run(){

        int arr[][] = new int[5][5];

        Scanner sc = new Scanner(System.in);
        int r=-1,c=-1;

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    r = i;
                    c = j;
                    break;
                }
            }
        }

        int ans = 0 ;
        if (r != 2) ans+= abs(3-(r+1));
        if (c != 2) ans+= abs(3-(c+1));

        System.out.println(ans);
    }
}
