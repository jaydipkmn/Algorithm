package TimeConversion;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        char[] inChar = in.toCharArray();
        char[] out = Arrays.copyOfRange(inChar, 0, 8);
        String hh = in.substring(0,2);
        boolean isHrsEqualsTo12 = hh.equals("12");
        if(inChar[8] == 'A' && isHrsEqualsTo12) {
            out[0] = '0';
            out[1] = '0';
        }
        else if(inChar[8] =='P' && !isHrsEqualsTo12) {
            char[] f = ("" + (Integer.parseInt(hh) + 12)).toCharArray();
            out[0] = f[0];
            out[1] = f[1];
        }
        System.out.println(out);
    }
}
