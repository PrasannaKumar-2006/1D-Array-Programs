package lc217;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Set<Integer> s = new HashSet<>();

        for (int x : a) {
            if (s.contains(x)) {
                System.out.println("true");
                return;
            }

            s.add(x);
        }

        System.out.println("false");
    }
}