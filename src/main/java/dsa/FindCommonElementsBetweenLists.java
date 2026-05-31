package main.java.dsa;

import java.util.ArrayList;

/*
 * Problem Name: Find Common Elements Between Two Lists
 *
 * Problem Statement:
 * Given two lists of strings, find and display the common elements
 * present in both lists.
 *
 * The program uses the retainAll() method, which retains only the
 * elements that are present in both collections.
 *
 * Example:
 *
 * Input:
 * List 1 = [a, b, c, d]
 * List 2 = [a, b, d, e]
 *
 * Output:
 * [a, b, d]
 *
 * Explanation:
 * The elements 'a', 'b', and 'd' are present in both lists.
 * The retainAll() method removes elements from the first list that
 * are not present in the second list.
 *
 * Approach:
 * 1. Create and populate the first list.
 * 2. Create and populate the second list.
 * 3. Use retainAll() on the first list and pass the second list as an argument.
 * 4. retainAll() keeps only the common elements.
 * 5. Print the resulting list containing common elements.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the first list.
 * m = Number of elements in the second list.
 */

public class FindCommonElementsBetweenLists {

    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList<>();

        firstList.add("a");
        firstList.add("b");
        firstList.add("c");
        firstList.add("d");

        ArrayList<String> secondList = new ArrayList<>();

        secondList.add("a");
        secondList.add("b");
        secondList.add("d");
        secondList.add("e");

        firstList.retainAll(secondList);

        System.out.println(firstList);
    }
}