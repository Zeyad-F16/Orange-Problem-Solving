package Problems;

import java.util.Scanner;

public class Coins {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0 ; i < 3 ; i++){
           String s = sc.nextLine();
           if(s.charAt(1) == '<'){
               if(s.charAt(2) == 'A') a++;
               else if(s.charAt(2) == 'B') b++;
               else c++;
           }
           else if(s.charAt(1) == '>'){
               if(s.charAt(0) == 'A') a++;
               else if(s.charAt(0) == 'B') b++;
               else c++;
           }
        }

        String ans = "";
        if(a == 2) {
            if(b > c){
                ans = "CBA";
            }
            else ans = "BCA";
        }
        else if(b == 2){
            if(a > c){
                ans = "CAB";
            }
            else ans = "ACB";

        }
        else{
            if(a > b){
                ans = "BAC";
            }
            else ans = "CBA";
        }

        System.out.println(ans);



    }
}
