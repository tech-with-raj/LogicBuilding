package main.java.dsa;

/*
 * Problem Name: Check Whether a Number is Even or Odd
 *
 * Problem Statement:
 * Given an integer number, determine whether it is Even or Odd.
 *
 * A number is:
 * - Even if it is divisible by 2.
 * - Odd if it is not divisible by 2.
 *
 * This solution demonstrates two approaches:
 * 1. Using the Modulus (%) Operator
 * 2. Using the Bitwise AND (&) Operator
 *
 * Example:
 *
 * Input:
 * 32
 *
 * Output:
 * This number is Even number
 * This number is Even number
 *
 * Explanation:
 * 32 is divisible by 2, so it is an Even number.
 *
 * Approach 1: Modulus Operator
 * 1. Divide the number by 2.
 * 2. Check the remainder using % operator.
 * 3. If remainder is 0, the number is Even.
 * 4. Otherwise, the number is Odd.
 *
 * Approach 2: Bitwise AND Operator
 * 1. Perform num & 1.
 * 2. If the result is 1, the number is Odd.
 * 3. If the result is 0, the number is Even.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class EvenOrOdd {

    public static void main(String[] args) {

        int num = 32;

        // Using Modulus Operator
        if ((num % 2) == 1) {

            System.out.println("This number is Odd number");

        } else {

            System.out.println("This number is Even number");
        }

        // Using Bitwise AND Operator
        if ((num & 1) == 1) {

            System.out.println("This number is Odd number");

        } else {

            System.out.println("This number is Even number");
        }
    }
}