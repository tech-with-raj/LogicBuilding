package main.java.dsa;

/*
Problem Statement:
Write a Java program to print a number diamond pattern.

Input:
n = 5

Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

Approach:
1. Print the upper triangle pattern from 1 to n.
2. Print the lower inverted triangle pattern from n-1 to 1.z
3. Use nested loops to print numbers in each row.
*/

public class NumberDiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}