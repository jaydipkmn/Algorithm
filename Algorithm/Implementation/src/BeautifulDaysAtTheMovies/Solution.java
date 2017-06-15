package BeautifulDaysAtTheMovies;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for(int x=i;x<=j;x++)
        {
            if(Math.abs(x-reveresed(x))%k==0)
                count++;
        }
        System.out.println(count);
        in.close();
    }

    private static int reveresed(int x) {
        int rev = 0;
        while(x>0)
        {
            rev = 10*rev+x%10;
            x/=10;
        }
        return rev;
    }
}
