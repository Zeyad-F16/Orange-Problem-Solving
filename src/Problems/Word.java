package Problems;
import java.util.Scanner;

public class Word {
    public static void run(){

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        int lower = 0 , upper = 0;

        for(char c : x.toCharArray()){
            if((int)c >= 97 ) lower++;
            else upper++;
        }

        if(lower >= upper) System.out.println(x.toLowerCase());
        else System.out.println(x.toUpperCase());
    }
}
