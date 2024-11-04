package org.example;

import java.util.Arrays;

public class Ex09SecondLargestOfArray {
    public static void main(String[] args) {
        int[] arr = {
                -176, 37, 113, 243, 96, 249, 204, -259, -165, 257, 184, -198, 241,
                115, 30, 156, 243, -286, 159, 45, 289, -242, 248, 267, 144, 130,
                262, 5, 243, 67, 202, 228, 144, 124, 289, 0, 171, 60, 169, 288};
        int premax, max;
        premax = max = arr[0];

        System.out.println("Array of integers:");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int e : arr) {
            if (e > max)
                max = e;
            if (e > premax && e < max)
                premax = e;

        }
        System.out.println("The second largest number in the array is " + premax + ".");


    }
}
