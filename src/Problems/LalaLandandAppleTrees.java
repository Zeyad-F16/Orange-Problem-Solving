package Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LalaLandandAppleTrees {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<int[]> left = new ArrayList<>();
        List<int[]> right = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int a = sc.nextInt();

            if (x < 0) {
                left.add(new int[]{-x, a});
            } else {
                right.add(new int[]{x, a});
            }
        }

        left.sort(Comparator.comparingInt(tree -> tree[0]));
        right.sort(Comparator.comparingInt(tree -> tree[0]));

        int l = left.size();
        int r = right.size();
        int apples = 0;

        if (l == r) {
            for (int[] tree : left) apples += tree[1];
            for (int[] tree : right) apples += tree[1];
        } else if (l < r) {
            for (int[] tree : left) apples += tree[1];
            for (int i = 0; i <= l; i++) apples += right.get(i)[1];
        } else {
            for (int[] tree : right) apples += tree[1];
            for (int i = 0; i <= r; i++) apples += left.get(i)[1];
        }

        System.out.println(apples);
    }
}
