package main.java.dsa;

/*
 * Problem Name: Armstrong Number
 *
 * Problem Statement:
 * Given an integer number, determine whether it is an Armstrong Number.
 *
 * An Armstrong Number is a number that is equal to the sum of the cubes
 * of its individual digits.
 *
 * Example:
 *
 * Input:
 * 153
 *
 * Output:
 * Given number 153 is Armstrong
 *
 * Explanation:
 * 1³ + 5³ + 3³ = 153
 *
 * Approach:
 * 1. Store the original number in a temporary variable.
 * 2. Extract each digit using the modulus (%) operator.
 * 3. Calculate the cube of the extracted digit.
 * 4. Add the cube value to a running sum.
 * 5. Remove the last digit using integer division (/).
 * 6. Repeat until all digits are processed.
 * 7. Compare the calculated sum with the original number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;
        int copy = number;
        int lastDigit;
        int armStrong = 0;

        while (copy != 0) {

            lastDigit = copy % 10;
            copy = copy / 10;

            armStrong = armStrong + (lastDigit * lastDigit * lastDigit);
        }

        if (number == armStrong) {
            System.out.println("Given number " + number + " is Armstrong");
        } else {
            System.out.println("Given number " + number + " is not Armstrong");
        }
    }
}