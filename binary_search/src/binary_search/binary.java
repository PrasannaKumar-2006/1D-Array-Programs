package binary_search;

import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int t = sc.nextInt();

        int l = 0, r = n - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (a[m] == t) {
                System.out.println("Found at index " + m);
                return;
            } else if (a[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        System.out.println("Not found");
    }
}