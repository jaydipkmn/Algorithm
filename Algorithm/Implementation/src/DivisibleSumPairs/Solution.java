package DivisibleSumPairs;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int count = divisibleSumPairs(n, k, a);
        System.out.println(count);
    }

    private static int divisibleSumPairs(int n, int k, int[] a) {

        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                if ((i < j) && (a[i] + a[j]) % k == 0)
                    count++;
            }
        return count;
    }
}
