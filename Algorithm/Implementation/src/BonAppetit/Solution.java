package BonAppetit;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        int sum = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            sum+=ar[ar_i];
        }
        int b = in.nextInt();
        int bActual = (sum-ar[k])/2;
        String result = b==bActual?"Bon Appetit":b-bActual+"";
        System.out.println(result);
    }
}
