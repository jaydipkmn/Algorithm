package AppendAndDelete;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int sLength = s.length();
        int tLength = t.length();
        int cL =  getCommonLength(s, t, sLength, tLength);
        int totalLen = getTotalLength(sLength, tLength);
        System.out.println(isConvertable(k, cL, totalLen)? "Yes":"No");
    }
    private static boolean isConvertable(int k, int cL, int totalLen) {
        if ((totalLen - 2 * cL) > k) 
            return false;
        else if ((totalLen - 2 * cL) % 2 == k % 2)
            return true;
        else if ((totalLen - k) < 0)
            return true;
        else
            return false;
    }
    private static int getTotalLength(int sLength, int tLength) {
        return sLength + tLength;
    }
    private static int getCommonLength(String s, String t, int sLength, int tLength) {
        int cL=0;
        for (int i = 0; i < java.lang.Math.min(sLength, tLength); i++) {
            if (s.charAt(i) == t.charAt(i))
                cL++;
            else
                break;
        }
        return cL;
    }
}