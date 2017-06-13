package CatsAndMouse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int catA = Math.abs(x-z);
            int catB = Math.abs(y-z);
            if(catA==catB)
                System.out.println("Mouse C");
            else if(catA>catB)
                System.out.println("Cat B");
            else
                System.out.println("Cat A");
        }
        in.close();
    }
}
