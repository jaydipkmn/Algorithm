package QueensAttack2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQ = in.nextInt();
        int cQ = in.nextInt();
              
        int up    = n - rQ;
        int right = n - cQ;
        int down  = rQ - 1;
        int left  = cQ - 1;
        int upRt  = Math.min(up, right);
        int dnLf  = Math.min(down, left);
        int upLf  = Math.min(up, left);
        int dnRt  = Math.min(down, right);
              
        for(int i = 0; i < k; i++) {
          int r = in.nextInt();
          int c = in.nextInt();
                  
          int dR = r - rQ;
          int dC = c - cQ;
          int distR = Math.abs(dR) - 1;
          int distC = Math.abs(dC) - 1;
                  
          if( r ==  rQ && c > cQ) { right = Math.min(right, distC); }
          if( r ==  rQ && c < cQ) {  left = Math.min(left,  distC); }
          if( c ==  cQ && r > rQ) {    up = Math.min(up,    distR); }
          if( c ==  cQ && r < rQ) {  down = Math.min(down,  distR); }
          if(dR ==  dC && dR > 0) {  upRt = Math.min(upRt,  distR); }
          if(dR ==  dC && dR < 0) {  dnLf = Math.min(dnLf,  distR); }
          if(dR == -dC && dR > 0) {  upLf = Math.min(upLf,  distR); }
          if(dR == -dC && dR < 0) {  dnRt = Math.min(dnRt,  distR); }
        }
        System.out.println(right + left + up + down
          + upRt + dnLf + upLf + dnRt);
        in.close();
        }
}
