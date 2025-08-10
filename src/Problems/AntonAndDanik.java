package Problems;

import java.util.Scanner;

public class AntonAndDanik {

    public static void run(){

        int n ;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        String s;
        s = input.next();
        int As = 0;
        int Ds = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == 'A')
                As++;
            else
                Ds++;
        }

        if (As > Ds) System.out.println("Anton");
        else if (Ds > As) System.out.println("Danik");
        else System.out.println("Friendship");


    }


}
