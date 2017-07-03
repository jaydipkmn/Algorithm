package EqualizeTheArray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[101];
        for (int i = 0; i < n; i++) {
            a[in.nextInt()]++;
        }
        Arrays.sort(a);
        int max = a[100];
        System.out.println(n-max);
    }
}
