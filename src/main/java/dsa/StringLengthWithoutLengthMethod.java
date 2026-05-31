package main.java.dsa;

/*
 * Problem Name: Find Length of a String Without Using length()
 *
 * Problem Statement:
 * Given a string, find its length without using the built-in length()
 * method of the String class.
 *
 * Example:
 *
 * Input:
 * "Hello Rajasekar"
 *
 * Output:
 * Length of String Hello Rajasekar is 15
 *
 * Explanation:
 * Convert the string into a character array and count each character
 * manually by traversing the array.
 *
 * Approach:
 * 1. Convert the string into a character array using toCharArray().
 * 2. Initialize a counter variable with 0.
 * 3. Traverse each character in the array.
 * 4. Increment the counter for every character encountered.
 * 5. Print the final count as the length of the string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of characters in the string.
 */

public class StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        String input = "Hello Rajasekar";

        char[] charArray = input.toCharArray();

        int count = 0;

        for (char character : charArray) {

            count++;
        }

        System.out.println("Length of String " + input + " is " + count);
    }
}