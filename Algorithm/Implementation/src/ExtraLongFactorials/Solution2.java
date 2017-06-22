package ExtraLongFactorials;

import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =  in.nextInt();
        printFactorial(N);
    }
    private static void printFactorial(int n) {
        int[] arr = new int[200];
        arr[0] = 1;
        int carry = 0;
        int k = 0;
        for (int i=1;i<=n;i++)
        {
            for(int j = 0; j<=k;j++)
            {
                arr[j] = arr[j] * i + carry;
                carry = arr[j] / 10;
                arr[j] = arr[j] % 10;
            }
            while(carry>0) { 
                k++;
                arr[k] = carry % 10;
                carry /= 10;
            }  
        }
        for(int i = k; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
