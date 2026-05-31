package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Name: Two Sum
 *
 * Problem Statement:
 * Given an integer array and a target value, find the indices of
 * the two numbers such that they add up to the target.
 *
 * Assumptions:
 * 1. Exactly one valid solution exists.
 * 2. The same element cannot be used twice.
 * 3. Return the indices of the two numbers.
 *
 * Example:
 *
 * Input:
 * Array = [2, 7, 11, 15]
 * Target = 9
 *
 * Output:
 * Indices: [0, 1]
 *
 * Explanation:
 * Array Elements:
 *
 * Index 0 → 2
 * Index 1 → 7
 * Index 2 → 11
 * Index 3 → 15
 *
 * Target:
 * 9
 *
 * Required Equation:
 * number1 + number2 = target
 *
 * 2 + 7 = 9
 *
 * Therefore:
 * Indices = [0, 1]
 *
 * HashMap Strategy:
 * - Key   = Number
 * - Value = Index
 *
 * While traversing the array:
 * - Compute complement = target - currentNumber
 * - Check whether the complement already exists in the map.
 * - If found, return both indices immediately.
 *
 * Approach:
 * 1. Create a HashMap to store numbers and their indices.
 * 2. Traverse the array.
 * 3. Calculate:
 *    complement = target - currentNumber
 * 4. Check whether the complement exists in the map.
 * 5. If found:
 *    - Return the complement index and current index.
 * 6. Otherwise:
 *    - Store the current number and index in the map.
 * 7. Continue until a valid pair is found.
 * 8. Throw an exception if no valid pair exists.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of elements in the array.
 */

public class TwoSum {

    public static int[] findTwoSumIndices(int[] numbers, int target) {

        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int index = 0; index < numbers.length; index++) {

            int complement = target - numbers[index];

            if (numberIndexMap.containsKey(complement)) {

                return new int[]{
                        numberIndexMap.get(complement),
                        index
                };
            }

            numberIndexMap.put(numbers[index], index);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};

        int target = 9;

        int[] result = findTwoSumIndices(numbers, target);

        System.out.println(
                "Indices: ["
                        + result[0]
                        + ", "
                        + result[1]
                        + "]"
        );
    }
}