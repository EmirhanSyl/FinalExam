package com.blackflower.finalexam;

/**
 *
 * @author emirs
 */
public class MatrixQ {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 0, 0, 1},
            {2, 4, 3, 3, 2},
            {0, 6, 1, 6, 0},
            {1, 2, 6, 3, 1},
            {1, 6, 1, 6, 1},
        };
        
        int leftSum = 0;
        int rightSum = 0;        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < i) {
                    leftSum += array[i][j];
                }
                else if(i < j){
                    rightSum += array[i][j];
                }
            }
        }
        if (leftSum > rightSum) {
            System.out.println("Left area is " + leftSum + " and bigger ");
        }
        else if (rightSum > leftSum) {
            System.out.println("Right area is " + rightSum + " and bigger ");
        }
    }
}
