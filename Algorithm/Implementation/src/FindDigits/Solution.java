package FindDigits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int T = in.nextInt();
        while(T-->0)
        {
            int count = 0;
            int n = in.nextInt();
            int N=n;
            while(n>0)
            {
                int d = n%10;
                if(d!=0 && N%d==0)
                    count++;
                n/=10;   
            }
            System.out.println(count);
        }
    }
}
