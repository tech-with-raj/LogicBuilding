package main.java.dsa;

/*
 * Problem Name: Transpose of a Matrix
 *
 * Problem Statement:
 * Given a matrix of size M × N, find its transpose.
 *
 * The transpose of a matrix is obtained by converting all rows
 * into columns and all columns into rows.
 *
 * Matrix Rule:
 *
 * Original Matrix:
 * matrix[row][column]
 *
 * Transposed Matrix:
 * transpose[column][row]
 *
 * Example:
 *
 * Input Matrix:
 *
 * 1 2 3
 * 4 5 6
 *
 * Output Matrix (Transpose):
 *
 * 1 4
 * 2 5
 * 3 6
 *
 * Explanation:
 * Original Matrix Dimensions:
 * 2 × 3
 *
 * Transposed Matrix Dimensions:
 * 3 × 2
 *
 * Element Mapping:
 *
 * matrix[0][0] → transpose[0][0]
 * matrix[0][1] → transpose[1][0]
 * matrix[0][2] → transpose[2][0]
 * matrix[1][0] → transpose[0][1]
 * matrix[1][1] → transpose[1][1]
 * matrix[1][2] → transpose[2][1]
 *
 * Approach:
 * 1. Create the original matrix.
 * 2. Create a result matrix with reversed dimensions.
 * 3. Print the original matrix.
 * 4. Traverse the original matrix.
 * 5. Assign:
 *    result[column][row] = matrix[row][column]
 * 6. Print the transposed matrix.
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 *
 * Where:
 * m = Number of rows in the original matrix.
 * n = Number of columns in the original matrix.
 */

public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = new int[2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        int[][] transposedMatrix = new int[3][2];

        System.out.println("Original Matrix:");

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[0].length; column++) {

                System.out.print(matrix[row][column] + " ");
            }

            System.out.println();
        }

        // Generate transpose matrix
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[0].length; column++) {

                transposedMatrix[column][row] = matrix[row][column];
            }
        }

        System.out.println("Transpose Matrix:");

        for (int row = 0; row < transposedMatrix.length; row++) {

            for (int column = 0; column < transposedMatrix[0].length; column++) {

                System.out.print(transposedMatrix[row][column] + " ");
            }

            System.out.println();
        }
    }
}