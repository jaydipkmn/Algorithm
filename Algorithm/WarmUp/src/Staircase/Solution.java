package Staircase;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < temp - 1; j++)
            {
                System.out.print(" ");
            }
            temp--;
            for (int c = 0; c <= i; c++)
                System.out.print("#");
            System.out.print("\n");
        }
    }
}
