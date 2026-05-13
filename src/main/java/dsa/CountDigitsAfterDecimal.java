
package main.java.dsa;

/*
===========================================
Problem: Count Digits After Decimal Point
===========================================

Description:
Write a Java program to count how many digits
are present after the decimal point in a double number.

Example:
Input  : 123.4567
Output : 4

Approach:
1. Convert the double value into String.
2. Find the index of decimal point (.).
3. Total digits after decimal =
   total length - decimal index - 1
*/


public class CountDigitsAfterDecimal {

    public static void main(String[] args) {

        double number = 123.4567;

        String input = String.valueOf(number);

        int indexOfDecimal = input.indexOf(".");

        int digitsAfterDecimal = input.length() - indexOfDecimal - 1;

        System.out.println("Digits after decimal: " + digitsAfterDecimal);
    }
}