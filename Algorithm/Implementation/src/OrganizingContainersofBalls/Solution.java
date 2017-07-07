package OrganizingContainersofBalls;

import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int[] columnsSum = new int[n];
            int[] rowsSum = new int[n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    int x = sc.nextInt();
                    rowsSum[i] += x;
                    columnsSum[j] += x;
                }
            }
            Arrays.sort(columnsSum);
            Arrays.sort(rowsSum);
            System.out.println(Arrays.equals(columnsSum, rowsSum) ? "Possible" : "Impossible");
        }
        sc.close();
    }
}
