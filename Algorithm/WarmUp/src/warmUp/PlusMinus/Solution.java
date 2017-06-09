package warmUp.PlusMinus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int matrix[] = new int[n];
        float positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            matrix[i] = in.nextInt();
            if (matrix[i] > 0)
                positive++;
            else if (matrix[i] < 0)
                negative++;
            else
                zero++;
        }
        float pFrac = positive / n;
        float nFrac = negative / n;
        float zFrac = zero / n;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(pFrac) + "\n" + df.format(nFrac) + "\n" + df.format(zFrac));
    }
}
