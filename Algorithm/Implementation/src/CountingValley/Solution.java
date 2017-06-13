package CountingValley;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        char[] hike = input.next().toCharArray();
        int count = 0;
        int altitude = 0;
        for (char c : hike) {
            if (c == 'U') {
                if (altitude == -1) {
                    count++;
                }
                altitude++;
            } else
                altitude--;
        }
        input.close();
        System.out.println(count);
    }
}