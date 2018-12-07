package com.practice.leetcode.array;

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Leetcode: https://leetcode.com/problems/rotate-image/
 * Created by George Fouche on 11/27/18.
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        rotate(matrix);
        printMatrix(matrix);
    }

    private static int[][] rotate(int[][] matrix) {

        return matrix;
    }


   public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
