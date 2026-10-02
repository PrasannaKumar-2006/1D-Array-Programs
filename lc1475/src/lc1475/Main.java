package lc1475;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] <= a[i]) {
                    a[i] = a[i] - a[j];
                    break;
                }
            }
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}