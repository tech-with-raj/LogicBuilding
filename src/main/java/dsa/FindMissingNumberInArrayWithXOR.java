package main.java.dsa;

/*
 * Problem Name: Find Missing Number in an Array Using XOR
 *
 * Problem Statement:
 * Given an array containing distinct integers from 1 to N,
 * where exactly one number is missing, find the missing number
 * using the XOR operation.
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
 * The complete sequence from 1 to 6 is:
 * [1, 2, 3, 4, 5, 6]
 *
 * The given array contains:
 * [1, 2, 4, 5, 6]
 *
 * Number 3 is missing.
 *
 * XOR Properties Used:
 * - A ^ A = 0
 * - A ^ 0 = A
 * - XOR operation is commutative and associative
 *
 * When all array elements and numbers from 1 to N are XORed together,
 * the matching numbers cancel each other out, leaving only the missing number.
 *
 * Approach:
 * 1. Initialize a variable to store the XOR result.
 * 2. XOR all elements present in the array.
 * 3. XOR all numbers from 0 to N.
 * 4. Matching numbers cancel each other.
 * 5. The remaining value is the missing number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class FindMissingNumberInArrayWithXOR {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};

        int missingNumber = 0;

        // XOR all array elements
        for (int number : numbers) {

            missingNumber = missingNumber ^ number;
        }

        // XOR numbers from 0 to N
        for (int i = 0; i <= 6; i++) {

            missingNumber = missingNumber ^ i;
        }

        System.out.println("Missing number is " + missingNumber);
    }
}