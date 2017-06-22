package JumpingOnTheCloudsRevisited;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int N = in.nextInt(); 
        int K = in.nextInt(); 
        int[] cloud= new int[N];
        int E = 100;
        for(int i=0;i<N;i++)
        {
            cloud[i] = in.nextInt();
        }
        int i = 0;
        do
        {
            i = (i+K)%N;
            E--;
            if(cloud[i]==1)
                E -=2;
        }
        while(i!=0);
        System.out.println(E);
    }
}
