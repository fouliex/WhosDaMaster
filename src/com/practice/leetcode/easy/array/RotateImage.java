package com.practice.leetcode.easy.array;

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Leetcode: https://leetcode.com/problems/rotate-image/
 * Created by George Fouche on 11/27/18.
 */
public class RotateImage {
    public static void main(String[] args) {

        int[][] matrix2x2 = {
                {0, 1},
                {2, 3},
        };

        int[][] matrix3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };


        int[][] matrix4x4 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };


        rotateWithMatrixSize2(matrix2x2);
        printMatrix(matrix2x2);

        rotateWithMatrixSize4(matrix3x3);
        printMatrix(matrix3x3);
    }

    @SuppressWarnings("Duplicates")
    public static int[][] rotateWithMatrixSize2(int[][] matrix) {
        int last = matrix.length - 1;
        int temp;

        for (int i = 0; i < last; i++) {
            // Swap matrix[i][i] and  matrix[i][last])
            temp = matrix[i][i];
            matrix[i][i] = matrix[i][last];
            matrix[i][last] = temp;

            // Swap matrix[i][i] and matrix[last][last])
            temp = matrix[i][i];
            matrix[i][i] = matrix[last][last];
            matrix[last][last] = temp;

            // swap(matrix[i][i], matrix[last][i]);
            temp = matrix[i][i];
            matrix[i][i] = matrix[last][i];
            matrix[last][i] = temp;
        }
        return matrix;
    }

    @SuppressWarnings("Duplicates")
    public static int[][] rotateWithMatrixSize3(int[][] matrix) {
        int last = matrix.length - 1;
        int temp;
        int level = 0;


        for (int i = 0; i < last; i++) {
            // Swap matrix[level][i] and  matrix[i][last])
            temp = matrix[level][i];
            matrix[level][i] = matrix[i][last];
            matrix[i][last] = temp;

            // Swap matrix[level][i] and matrix[last][last- i])
            temp = matrix[level][i];
            matrix[level][i] = matrix[last][last - i];
            matrix[last][last - i] = temp;

            // swap(matrix[level][i], matrix[last -i][level]);
            temp = matrix[level][i];
            matrix[level][i] = matrix[last - i][level];
            matrix[last - i][level] = temp;
        }
        return matrix;
    }


    @SuppressWarnings("Duplicates")
    public static int[][] rotateWithMatrixSize4(int[][] matrix) {
        int last = matrix.length - 1;
        int temp;
        int level = 0;
        int totNumOfLevels = matrix.length / 2;

        while (level < totNumOfLevels) {

            for (int i = level; i < last; i++) {
                // Swap matrix[level][i] and  matrix[i][last])
                temp = matrix[level][i];
                matrix[level][i] = matrix[i][last];
                matrix[i][last] = temp;

                // Swap matrix[level][i] and matrix[last][last - i + level])
                temp = matrix[level][i];
                matrix[level][i] = matrix[last][last - i + level];
                matrix[last][last - i + level] = temp;

                // swap(matrix[level][i], matrix[last -i + level ][level]);
                temp = matrix[level][i];
                matrix[level][i] = matrix[last - i + level][level];
                matrix[last - i + level][level] = temp;
            }
            level++;
            last--;

        }
        return matrix;
    }


    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
