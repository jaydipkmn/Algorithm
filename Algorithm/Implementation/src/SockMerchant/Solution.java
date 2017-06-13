package SockMerchant;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c;
        int[] c_arr = new int[101];
        int count = 0;
        for (int i = 0; i < n; i++) {
            c = in.nextInt();
            if(c_arr[c]==1)
            {
                count++;
                c_arr[c]=0;
            }
            else
                c_arr[c]=1;
        }
        System.out.println(count);
    }
}
