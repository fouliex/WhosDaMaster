package com.practice.essential.array;

/**
 * Is One Array a Rotation of Another
 * <p>
 * Write a function that returns true if one array is a rotation of another.
 * NOTE: There are no duplicates in each of these arrays.
 * <p>
 * Example:
 * [1,2,3,4,5,6,7] is a rotation of [4,5,6,7,1,2,3]
 */
public class IsRotation {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.

        System.out.println(isRotation(array1, array2b));
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
        if (!(array1.length == array2.length)) {
            return false;
        }
        int firstNumber = array1[0];
        int k = 0;

        for (int i = 0; i < array2.length; i++) {
            if (firstNumber == array2[i]) {
                k = i -1;
            }
        }

        for (int j = 0; j < array2.length; j++) {
            if (array1[(j + k) % array1.length] != array2[j]) {
                return false;
            }
        }


        return true;
    }
}
