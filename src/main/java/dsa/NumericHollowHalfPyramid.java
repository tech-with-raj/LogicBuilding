package main.java.dsa;

/*
 * Problem Name: Numeric Hollow Half Pyramid Pattern
 *
 * Problem Statement:
 * Given a number of rows, print a Numeric Hollow Half Pyramid pattern.
 *
 * Rules:
 * 1. Print numbers at the left boundary.
 * 2. Print numbers at the right boundary.
 * 3. Print all numbers in the last row.
 * 4. Print spaces in the hollow region.
 *
 * Example:
 *
 * Input:
 * Total Rows = 5
 *
 * Output:
 * 1
 * 12
 * 1 3
 * 1  4
 * 12345
 *
 * Explanation:
 * - The first and last positions of each row are printed with numbers.
 * - The last row is completely filled with numbers.
 * - All inner positions are replaced with spaces to create the hollow effect.
 *
 * Approach:
 * 1. Iterate through each row from 1 to the total number of rows.
 * 2. For every row, iterate through columns from 1 to the current row number.
 * 3. Print the column number when:
 *    - It is the first column.
 *    - It is the last column of the row.
 *    - It belongs to the last row.
 * 4. Otherwise, print a space.
 * 5. Move to the next line after completing each row.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Total number of rows.
 */

public class NumericHollowHalfPyramid {

    public static void main(String[] args) {

        int totalNumberOfRows = 5;

        for (int row = 1; row <= totalNumberOfRows; row++) {

            for (int column = 1; column <= row; column++) {

                if (column == 1
                        || column == row
                        || row == totalNumberOfRows) {

                    System.out.print(column);

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}