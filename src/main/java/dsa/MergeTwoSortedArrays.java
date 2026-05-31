package main.java.dsa;

import java.util.Arrays;

/*
 * Problem Name: Merge Two Sorted Arrays
 *
 * Problem Statement:
 * Given two sorted integer arrays, merge them into a single sorted array.
 *
 * The resulting array should contain all elements from both input arrays
 * while maintaining the sorted order.
 *
 * Example:
 *
 * Input:
 * Array 1 = [1, 3, 5]
 * Array 2 = [2, 4]
 *
 * Output:
 * [1, 2, 3, 4, 5]
 *
 * Explanation:
 * Both arrays are already sorted.
 *
 * Compare elements from both arrays and place the smaller element
 * into the merged array.
 *
 * Continue this process until one array is exhausted, then copy
 * the remaining elements from the other array.
 *
 * Approach:
 * 1. Create a new array with size equal to the sum of both array lengths.
 * 2. Initialize three pointers:
 *    - First array pointer
 *    - Second array pointer
 *    - Merged array pointer
 * 3. Compare elements from both arrays.
 * 4. Insert the smaller element into the merged array.
 * 5. Move the corresponding pointer forward.
 * 6. Repeat until one array is completely traversed.
 * 7. Copy any remaining elements from the first array.
 * 8. Copy any remaining elements from the second array.
 * 9. Print the merged sorted array.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * Where:
 * n = Number of elements in the first array.
 * m = Number of elements in the second array.
 */

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4};

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int mergedArrayIndex = 0;

        while (firstArrayIndex < firstArray.length
                && secondArrayIndex < secondArray.length) {

            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {

                mergedArray[mergedArrayIndex] = firstArray[firstArrayIndex];

                firstArrayIndex++;
                mergedArrayIndex++;

            } else {

                mergedArray[mergedArrayIndex] = secondArray[secondArrayIndex];

                secondArrayIndex++;
                mergedArrayIndex++;
            }
        }

        while (firstArrayIndex < firstArray.length) {

            mergedArray[mergedArrayIndex] = firstArray[firstArrayIndex];

            firstArrayIndex++;
            mergedArrayIndex++;
        }

        while (secondArrayIndex < secondArray.length) {

            mergedArray[mergedArrayIndex] = secondArray[secondArrayIndex];

            secondArrayIndex++;
            mergedArrayIndex++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }
}