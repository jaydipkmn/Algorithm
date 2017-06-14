package ClimbingTheLeaderboard;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s[] = new int[n];
        int rank[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
            if (i == 0) {
                rank[i] = 1;
            } else {
                if (s[i] == s[i - 1]) {
                    rank[i] = rank[i - 1];
                } else {
                    rank[i] = rank[i - 1] + 1;
                }
            }
        }
        int m = in.nextInt();
        int a[] = new int[m];
        int point = n - 1;
        for (int j = 0; j < m; j++) {
            a[j] = in.nextInt();
            int current_rank = 0;
            while (point >= 0 && a[j] > s[point]) {
                point--;
            }
            if (point == -1) {
                current_rank = 1;
            } else if (a[j] == s[point]) {
                current_rank = rank[point];
            } else if (a[j] < s[point]) {
                current_rank = rank[point] + 1;
            }
            System.out.println(current_rank);
        }
    }

}
