package Problems;

import java.util.Scanner;

public class LifeWithoutZeros {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        int x , y;
        x = sc.nextInt();
        y = sc.nextInt();

        int withZeros = x + y;

        String xPlusYWithoutZerosafterParse = Integer.toString(withZeros).replace("0", "");
        int xPlusYWithoutZeros = 0;
        if(!xPlusYWithoutZerosafterParse.isEmpty())
            xPlusYWithoutZeros = Integer.parseInt(xPlusYWithoutZerosafterParse);


        String Xs = Integer.toString(x).replace("0", "");
        String Ys = Integer.toString(y).replace("0", "");

        int xWithoutZeros = 0;
        int yWithoutZeros = 0;

        if(!Xs.isEmpty()) xWithoutZeros = Integer.parseInt(Xs);
        if(!Ys.isEmpty()) yWithoutZeros = Integer.parseInt(Ys);

        int sum = xWithoutZeros + yWithoutZeros;

        if(xPlusYWithoutZeros == sum) System.out.println("YES");
        else System.out.println("NO");
    }
}
