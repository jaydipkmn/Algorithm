package SherlockAndSquares;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int T = in.nextInt();
        while(T-->0)
        {
            int count = 0;
            int A = in.nextInt();
            int B = in.nextInt();
            count = (int) ((Math.floor(Math.sqrt(B))-Math.ceil(Math.sqrt(A)))+1);
            System.out.println(count);
        }
    }
}
