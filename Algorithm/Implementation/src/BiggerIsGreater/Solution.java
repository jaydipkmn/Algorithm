package BiggerIsGreater;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            process(in.next());
        }
        in.close();
    }
    static void process(String next) {
        String r = null;
        int len = next.length();
        if (len != 1) {
            int i = len - 2;
            while (i >= 0 && (r = process(i--, next)) == null)
                ;
        }
        String x = r == null ? "no answer" : r;
        System.out.println(x);
    }

    static String process(int in, String next) {
        char c = next.charAt(in);
        char[] ch = next.substring(in + 1).toCharArray();
        Arrays.sort(ch);
        if (c >= ch[ch.length - 1])
            return null;
        for (int i = 0; i < ch.length; i++) {
            char h = ch[i];
            if (c < h) {
                ch[i] = c;
                return next.substring(0, in) + h + new String(ch);
            }
        }
        throw new RuntimeException("wrong");
    }
}