package Encryption;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        int c = (int) Math.ceil(Math.sqrt(len));
        int r = (int) Math.floor(Math.sqrt(len));
        if(r * c < len) 
            r = c;
        for(int i = 0; i < c; i++){
            for(int j = i; j < len; j = j + c ){
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
        in.close();
    }
}
