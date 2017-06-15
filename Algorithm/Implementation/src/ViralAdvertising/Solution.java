package ViralAdvertising;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, total = 0;
        int ppl = 5;
        for (int i = 0; i < n; i++) {
            sum = (ppl / 2);
            ppl = sum * 3;
            total = total + sum;
            sum = 0;
        }
        sc.close();
        System.out.println(total);
    }
}
