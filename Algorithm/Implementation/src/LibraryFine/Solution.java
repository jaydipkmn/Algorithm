package LibraryFine;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RD = in.nextInt();
        int RM = in.nextInt();
        int RY = in.nextInt();
        int ED = in.nextInt();
        int EM = in.nextInt();
        int EY = in.nextInt();
        
        int dayDiff = RD-ED;
        int monthDiff = RM-EM;
        int yearDiff = RY-EY;
        int fine=0;
        if(dayDiff <=0 && monthDiff<=0 && yearDiff<=0)
            fine=0;
        else if(yearDiff>0)
            fine = 10000;
        else if(yearDiff==0&&monthDiff>0)
            fine = 500*monthDiff;
        else if(yearDiff==0&&monthDiff==0&&dayDiff>0)
            fine = 15*dayDiff;
        System.out.println(fine);    
    }
}
