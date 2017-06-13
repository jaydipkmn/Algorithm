package DrawingBook;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int page = in.nextInt();
        int f = page/2;
        int b = (n%2==0)?(n-page+1)/2:(n-page)/2;
        System.out.println(Math.min(f, b));
    }
}
