/*
Problem Statement:
Given an integer array, move all zeros to the end while maintaining
the relative order of non-zero elements.

After moving zeros:
1. Sort only the non-zero elements.
2. Keep zeros at the end.

Input:
[1, 3, 0, 4, 5, 0, 2, 0]

Output:
[1, 2, 3, 4, 5, 0, 0, 0]

Approach:
Step 1:
Move all non-zero elements to the front.

Step 2:
Fill remaining positions with zeros.

Step 3:
Sort only the non-zero portion of the array.
*/

package main.java.dsa;

import java.util.Arrays;

public class MoveZerosToEndAndSort {

    public static void main(String[] args) {

        int[] input = {1, 3, 0, 4, 5, 0, 2, 0};

        System.out.println("Input Array : "
                + Arrays.toString(input));

        int index = 0;

        // Move non-zero elements to front
        for (int number : input) {

            if (number != 0) {
                input[index] = number;
                index++;
            }
        }

        // Fill remaining positions with zeros
        for (int i = index; i < input.length; i++) {
            input[i] = 0;
        }

        // Sort only non-zero elements
        Arrays.sort(input, 0, index);

        System.out.println(
                "Final Output : "
                        + Arrays.toString(input));
    }
}