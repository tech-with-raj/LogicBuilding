package main.java.dsa;

/*
 * Problem Name: Find Second Largest Number in an Array
 *
 * Problem Statement:
 * Given an integer array, find the second largest distinct element
 * without sorting the array.
 *
 * The solution should traverse the array only once and maintain
 * the largest and second largest values encountered so far.
 *
 * Example:
 *
 * Input:
 * [3, 4, 5, 9, 33, 23, 7]
 *
 * Output:
 * 23
 *
 * Explanation:
 * Array Elements:
 *
 * 3, 4, 5, 9, 33, 23, 7
 *
 * Largest Number:
 * 33
 *
 * Second Largest Number:
 * 23
 *
 * The algorithm updates:
 * - largestNumber
 * - secondLargestNumber
 *
 * while traversing the array only once.
 *
 * Approach:
 * 1. Initialize:
 *    - largestNumber = Integer.MIN_VALUE
 *    - secondLargestNumber = Integer.MIN_VALUE
 * 2. Traverse each element in the array.
 * 3. If the current element is greater than the largest number:
 *    - Move the current largest to second largest.
 *    - Update the largest number.
 * 4. Otherwise, if the current element is greater than the second largest
 *    and different from the largest number:
 *    - Update the second largest number.
 * 5. Print the second largest number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 9, 33, 23, 7};

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int currentNumber : numbers) {

            if (currentNumber > largestNumber) {

                secondLargestNumber = largestNumber;

                largestNumber = currentNumber;

            } else if (currentNumber > secondLargestNumber
                    && currentNumber != largestNumber) {

                secondLargestNumber = currentNumber;
            }
        }

        System.out.println(secondLargestNumber);
    }
}