package SequenceEquation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=1;i<=n;i++)
            map.put(in.nextInt(),i);
        for(int j=1;j<=n;j++)
            System.out.println(map.get(map.get(j)));
        in.close();
    }
}
