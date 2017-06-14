package DesignerPDFViewer;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        int max = 0;
        char[] words = in.next().toCharArray();
        for(char c : words)
        {
            int offset = c-'a';
            if(h[offset]>max)
            {
                max=h[offset];
            }
        }
        System.out.println(max*words.length);
    }
}
