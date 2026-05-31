package main.java.dsa;

/*
 * Problem Name: Check Odd or Even Number and String Length
 *
 * Problem Statement:
 * Given an integer and a string:
 *
 * 1. Determine whether the integer is odd or even.
 * 2. Calculate the length of the string.
 * 3. Determine whether the string length is odd or even.
 *
 * Example:
 *
 * Input:
 * Number = 22
 * String = "Rajasekar"
 *
 * Output:
 * This is even number
 * Length of Rajasekar is 9
 * This is odd number length string
 *
 * Explanation:
 * Number Check:
 * 22 % 2 = 0
 * Therefore, 22 is an even number.
 *
 * String Length Check:
 * Length of "Rajasekar" = 9
 * 9 % 2 = 1
 * Therefore, the string length is odd.
 *
 * Approach:
 * 1. Store an integer value.
 * 2. Use the modulus (%) operator to determine whether the number is even or odd.
 * 3. Create a method to calculate the length of a string.
 * 4. Return the calculated length.
 * 5. Use the modulus (%) operator on the returned length.
 * 6. Determine whether the string length is even or odd.
 * 7. Print the results.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Where:
 * The string length operation is considered constant time for this example.
 */

public class OddOrEvenNumberChecker {

    public static void main(String[] args) {

        int number = 22;

        if ((number % 2) == 0) {

            System.out.println("This is even number");

        } else {

            System.out.println("This is odd number");
        }

        int stringLength = getStringLength();

        if ((stringLength % 2) == 0) {

            System.out.println("This is even number length string");

        } else {

            System.out.println("This is odd number length string");
        }
    }

    public static int getStringLength() {

        String name = "Rajasekar";

        int nameLength = name.length();

        System.out.println("Length of " + name + " is " + nameLength);

        return nameLength;
    }
}