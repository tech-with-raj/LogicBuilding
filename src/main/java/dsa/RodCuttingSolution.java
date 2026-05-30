package main.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: Rod Cutting Problem
 *
 * You are given an array of n metal rod lengths.
 *
 * In each round:
 * 1. Count the number of rods currently present.
 * 2. Find the shortest rod length.
 * 3. Remove all rods having the shortest length.
 * 4. Subtract the shortest rod length from every remaining rod.
 *
 * Repeat the process until no rods remain.
 *
 * Return a list where each element represents the number of rods
 * present at the beginning of each round.
 *
 * Example:
 *
 * Input:
 * [1, 1, 3, 4]
 *
 * Output:
 * [4, 2, 1]
 *
 * Explanation:
 *
 * Round 1:
 * Rods = [1, 1, 3, 4]
 * Count = 4
 * Shortest = 1
 * After Cut = [2, 3]
 *
 * Round 2:
 * Rods = [2, 3]
 * Count = 2
 * Shortest = 2
 * After Cut = [1]
 *
 * Round 3:
 * Rods = [1]
 * Count = 1
 * Shortest = 1
 * After Cut = []
 *
 * Final Output = [4, 2, 1]
 */
public class RodCuttingSolution {

    public static void main(String[] args) {

        int[] rods = {1, 1, 3, 4};

        Arrays.sort(rods);

        ArrayList<Integer> rodList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Convert array to ArrayList
        for (int rod : rods) {
            rodList.add(rod);
        }

        while (!rodList.isEmpty()) {

            // Store current rod count
            result.add(rodList.size());

            // Shortest rod length
            int shortest = rodList.get(0);

            ArrayList<Integer> next = new ArrayList<>();

            // Remove shortest rods and reduce remaining rods
            for (int rod : rodList) {

                if (rod == shortest) {
                    // discard rod
                } else {
                    next.add(rod - shortest);
                }
            }

            rodList = next;
        }

        System.out.println("Output : " + result);
    }
}