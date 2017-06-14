package UtopianTree;

import java.util.Scanner;

public class Solution {
    private static int height(int n) {
        int growth = 0;
        if (n == 0)
            return 1;
        else if (n % 2 == 1)
            growth = growth + (2 * height(n - 1));
        else
            growth = growth + (1 + height(n - 1));
        return growth;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(height(in.nextInt()));
        }
    }
}
