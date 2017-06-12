package MigratoryBirds;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arType = new int[6];
        int maxType = 0;
        for (int ar_i = 0; ar_i < n; ar_i++) {
            arType[in.nextInt()]++;
        }
        for (int i = 1; i < arType.length; i++) {
            if (arType[maxType] < arType[i]) {
                maxType = i;
            }
        }
        System.out.println(maxType);
    }
}