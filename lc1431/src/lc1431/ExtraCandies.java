package lc1431;

import java.util.*;

public class ExtraCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int extra = sc.nextInt();
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }

        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            res.add(a[i] + extra >= max);
        }

        System.out.println(res);
    }
}