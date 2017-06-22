package ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =  in.nextInt();
        System.out.println(getFactorial(N));
    }

    private static BigInteger getFactorial(int n) {
        if (n==0)
            return BigInteger.ONE;
        else
            return (BigInteger.valueOf(n).multiply(getFactorial(n-1)));
    }
}
