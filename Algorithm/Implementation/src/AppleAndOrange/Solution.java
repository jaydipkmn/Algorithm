package AppleAndOrange;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        System.out.println(getCount(s, t, a, apple));
        System.out.println(getCount(s, t, b, orange));
    }

    private static long getCount(int s, int t, int a, int[] apple) {
        return Arrays.stream(apple).filter(x -> x + a >= s && x + a <= t).count();
    }

}
