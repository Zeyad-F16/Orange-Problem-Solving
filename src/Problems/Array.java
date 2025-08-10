package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) positives.add(x);
            else if (x < 0) negatives.add(x);
            else zeros.add(x);
        }

        ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(negatives.remove(0));

        ArrayList<Integer> set2 = new ArrayList<>();
        if (!positives.isEmpty()) {
            set2.addAll(positives);
        } else {
            set2.add(negatives.remove(0));
            set2.add(negatives.remove(0));
        }

        ArrayList<Integer> set3 = new ArrayList<>();
        set3.addAll(negatives);
        set3.addAll(zeros);

        printSet(set1);
        printSet(set2);
        printSet(set3);
    }

    private static void printSet(List<Integer> set) {
        System.out.print(set.size());
        for (int num : set) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}

