package HurdleRace;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = 0;
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i]>max)
             max=height[height_i];
        }
        int diff = max-k;
        System.out.println(diff>0?diff:0);
    }
}
