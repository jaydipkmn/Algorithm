package NonDivisibleSubset;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int k  = in.nextInt();
        int ind[] = new int[k];         
        for(int i = 0; i<n; i++) {
            ind[(int)(in.nextLong()%k)]++;
        }
        
        int max = 0;
        int sum = 0;
        for(int i = 1; i<=k/2; i++) {
            if(k%2==0 && i == k/2)
                max ++;
            else
                max += Math.max(ind[i], ind[k-i]);
            sum += (ind[i] + ind[k-i]);
        }
        if(sum == ind[0])
            max = 1;
        else if(ind[0] != 0)
            max ++;
        System.out.println(max);
    }
}