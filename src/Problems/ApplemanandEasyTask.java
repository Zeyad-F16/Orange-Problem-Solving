package Problems;

import java.util.Scanner;

public class ApplemanandEasyTask {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[n][n];


        for (int i = 0; i < n; i++) {
            board[i] = sc.nextLine().toCharArray();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;

                if (i > 0 && board[i - 1][j] == 'o') count++;

                if (i < n - 1 && board[i + 1][j] == 'o') count++;

                if (j > 0 && board[i][j - 1] == 'o') count++;

                if (j < n - 1 && board[i][j + 1] == 'o') count++;

                if (count % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
