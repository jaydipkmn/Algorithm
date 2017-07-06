package ACMICPC;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet bitArray[]=new BitSet[n];
        int numberOnes, count = 0, maxOnes = 0;

        for (int i = 0; i < n; i++) {
            String[] sArray=in.next().split("");
            bitArray[i]=new BitSet(m);
            for(int j=0;j<sArray.length;j++)
            {
                if(sArray[j].equals("1"))
                bitArray[i].set(j,true);
                else
                    bitArray[i].set(j,false);   
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                BitSet temp=(BitSet) bitArray[i].clone();
                temp.or(bitArray[j]);
                numberOnes=temp.cardinality();
                if (numberOnes == maxOnes) {
                    count++;
                }
                if (numberOnes > maxOnes) {
                    maxOnes = numberOnes;
                    count = 1;
                }
            }
        }
        System.out.println(maxOnes);
        System.out.println(count);
        in.close();
    }
}