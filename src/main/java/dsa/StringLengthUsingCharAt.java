package main.java.dsa;

/*
 * Problem Name: Find Length of a String Using charAt() Without length()
 *
 * Problem Statement:
 * Given a string, determine its length without using the built-in
 * length() method or converting the string into a character array.
 *
 * Example:
 *
 * Input:
 * "Hello Rajasekar"
 *
 * Output:
 * 15
 *
 * Explanation:
 * Continuously access characters using charAt(index).
 * When the index exceeds the last valid position,
 * StringIndexOutOfBoundsException is thrown.
 * The number of successful accesses represents the length of the string.
 *
 * Approach:
 * 1. Initialize a counter variable with 0.
 * 2. Access characters using charAt(count).
 * 3. Increment the counter after each successful access.
 * 4. Continue until an exception occurs.
 * 5. When the exception is caught, print the counter value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of characters in the string.
 *
 * Note:
 * This is an interview-style approach to find string length without
 * using length(). Although it works, using exceptions for normal
 * control flow is generally not recommended in production code.
 */

public class StringLengthUsingCharAt {

    public static void main(String[] args) {

        String input = "Hello Rajasekar";

        int count = 0;

        while (true) {

            try {

                input.charAt(count);
                count++;

            } catch (StringIndexOutOfBoundsException exception) {

                System.out.println("Length of String " + input + " is " + count);
                break;
            }
        }
    }
}