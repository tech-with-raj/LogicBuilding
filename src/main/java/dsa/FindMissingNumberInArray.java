package main.java.dsa;

/*
 * Problem Name: Find Missing Number in an Array
 *
 * Problem Statement:
 * Given an array containing distinct integers from 1 to N,
 * where exactly one number is missing, find the missing number.
 *
 * The array contains N - 1 elements and all numbers are unique.
 *
 * Example:
 *
 * Input:
 * Array = [1, 2, 4, 5, 6]
 * Total Numbers = 6
 *
 * Output:
 * Missing number is 3
 *
 * Explanation:
 * The expected sequence from 1 to 6 is:
 * [1, 2, 3, 4, 5, 6]
 *
 * The given array contains:
 * [1, 2, 4, 5, 6]
 *
 * Number 3 is missing from the sequence.
 *
 * Approach:
 * 1. Calculate the expected sum of numbers from 1 to N using:
 *    N × (N + 1) / 2
 * 2. Traverse the array and calculate the actual sum of elements.
 * 3. Subtract the actual sum from the expected sum.
 * 4. The resulting value is the missing number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};

        int totalNumber = 6;

        // Calculate expected sum from 1 to N
        int expectedSum = (totalNumber * (totalNumber + 1)) / 2;

        // Calculate actual array sum
        int actualArraySum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {

            actualArraySum = actualArraySum + numbers[i];
        }

        int missingNumber = expectedSum - actualArraySum;

        System.out.println("Missing number is " + missingNumber);
    }
}