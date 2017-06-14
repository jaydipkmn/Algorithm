package ClimbingTheLeaderboard;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Comparator<Integer> c = new MyComparator();
        TreeSet<Integer> t = new TreeSet<Integer>(c);
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            if (!t.contains(data)) {
                t.add(data);
                l.add(data);
            }
        }
        // System.out.println(l);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int data = in.nextInt();
            int index = Collections.binarySearch(l, data, c);
            if (index < 0) {
                index = Math.abs(index);
            } else {
                index++;
            }
            System.out.println(index);
        }
    }

}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1);
    }
}