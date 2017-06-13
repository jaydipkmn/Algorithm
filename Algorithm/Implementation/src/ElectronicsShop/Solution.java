package ElectronicsShop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for (int drives_i = 0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int max = -1;
        for (int i = keyboards.length - 1; i >= 0; i--) {
            for (int j = drives.length - 1; j >= 0; j--) {
                int total = keyboards[i] + drives[j];
                
                if (total <= s) {
                    max = Math.max(max, total);
                }
            }
        }
        System.out.println(max);
    }
}
