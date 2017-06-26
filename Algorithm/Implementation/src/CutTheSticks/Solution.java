package CutTheSticks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            al.add(a);
        }
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            if (al.get(0) == 0) {
                al.remove(0);
                i = -1;
                continue;
            }
            System.out.println(al.size());
            int min = al.get(0);
            for (int j = 0; j < al.size(); j++) {
                al.set(j, al.get(j) - min);
            }
        }
        in.close();
    }
}