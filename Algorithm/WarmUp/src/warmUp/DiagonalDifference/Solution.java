package warmUp.DiagonalDifference;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftD=0;
        int rightD=0;
        int size = in.nextInt();
        int matrix[][] = new int[size][size];
        for(int i=0, k=size-1; i< size; i++, k--){
            for(int j=0; j< size; j++){
                matrix[i][j] = in.nextInt();;            
                if(i==j)
                 leftD += matrix[i][j];                        
            }
            rightD += matrix[i][k];              
        }

        System.out.print(Math.abs(leftD-rightD));
    }
}
