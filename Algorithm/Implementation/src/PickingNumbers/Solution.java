package PickingNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[j] - a[i] <= 1) {
                    cnt++;
                }
            }
            if (cnt > max)
                max = cnt;
            cnt = 0;
        }
        System.out.println(max);
    }
}
