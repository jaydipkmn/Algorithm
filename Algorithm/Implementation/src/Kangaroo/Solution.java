package Kangaroo;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if (x2 > x1 && v2 >= v1)
            System.out.println("NO");
        else if ((x2 - x1) % (v2 - v1) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
