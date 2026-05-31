package main.java.dsa;

/*
 * Problem Name: Numeric Half Pyramid Pattern
 *
 * Problem Statement:
 * Given a number of rows, print a numeric half pyramid pattern where
 * each row contains numbers starting from 1 up to the current row number.
 *
 * Example:
 *
 * Input:
 * Total Rows = 5
 *
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 * Explanation:
 * - Row 1 contains numbers from 1 to 1.
 * - Row 2 contains numbers from 1 to 2.
 * - Row 3 contains numbers from 1 to 3.
 * - This pattern continues until the last row.
 *
 * Approach:
 * 1. Iterate through each row from 1 to the total number of rows.
 * 2. For every row, iterate through columns from 1 to the current row number.
 * 3. Print the column value.
 * 4. Move to the next line after completing each row.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Total number of rows.
 */

public class NumericHalfPyramidPattern {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print(column);
            }

            System.out.println();
        }
    }
}