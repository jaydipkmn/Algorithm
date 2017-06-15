package CircularArrayRotation;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int NOR = in.nextInt();
        int q = in.nextInt();
        int element[] = new int[n];
        int elementFinal[] = new int[n];
        NOR = NOR % n;
        for (int i = 0; i < n; i++)
            element[i] = in.nextInt();
        for (int k = 0; k < n; k++) {
            if (k < NOR)
                elementFinal[k] = element[(n - NOR) + k];
            else 
                elementFinal[k] = element[k - NOR];
        }
        for (int i = 0; i < q; i++)
            System.out.println(elementFinal[in.nextInt()]);
    }
}