package AngryProfessor;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int time = in.nextInt();
                if (time <= 0)
                    count++;
            }
            if (count >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
        in.close();
    }
}