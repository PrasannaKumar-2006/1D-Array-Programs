package lc1365;

import java.util.*;

public class NumSmallCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = 0; j < n; j++) {
                if (a[j] < a[i])
                    c++;
            }

            res[i] = c;
        }

        for (int x : res)
            System.out.print(x + " ");
    }
}