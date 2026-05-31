package main.java.dsa;

/*
 * Problem Name: Alphabet Half Pyramid Pattern
 *
 * Problem Statement:
 * Given a number of rows, print an alphabet half pyramid pattern where
 * each row contains lowercase alphabets starting from 'a' up to the
 * current row length.
 *
 * Example:
 *
 * Input:
 * Total Rows = 5
 *
 * Output:
 * a
 * ab
 * abc
 * abcd
 * abcde
 *
 * Explanation:
 * - Row 1 contains alphabet 'a'.
 * - Row 2 contains alphabets 'a' and 'b'.
 * - Row 3 contains alphabets 'a', 'b', and 'c'.
 * - The pattern continues until the specified number of rows.
 *
 * ASCII Logic:
 * 'a' + 0 = a
 * 'a' + 1 = b
 * 'a' + 2 = c
 * ...
 *
 * Approach:
 * 1. Iterate through each row from 1 to the total number of rows.
 * 2. For every row, iterate through columns from 1 to the current row number.
 * 3. Convert the column position into a corresponding alphabet using ASCII arithmetic.
 * 4. Print the generated alphabet.
 * 5. Move to the next line after completing each row.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Total number of rows.
 */

public class AlphabetHalfPyramidPattern {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print((char) ('a' + column - 1));
            }

            System.out.println();
        }
    }
}