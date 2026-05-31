package main.java.dsa;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Problem Name: Find Common Elements Between Two Lists Using Streams
 *
 * Problem Statement:
 * Given two lists of strings, find and display the common elements
 * present in both lists using Java Stream API.
 *
 * The result should contain only those elements that exist in both lists.
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
 * The elements 'a', 'b', and 'd' are common to both lists.
 *
 * The Stream API filters elements from the first list by checking
 * whether they exist in the second list using the contains() method.
 *
 * The filtered elements are then collected into a Set to ensure uniqueness.
 *
 * Approach:
 * 1. Create and populate the first list.
 * 2. Create and populate the second list.
 * 3. Convert the first list into a stream.
 * 4. Filter elements that are present in the second list.
 * 5. Collect the filtered elements into a Set.
 * 6. Print the resulting Set of common elements.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(k)
 *
 * Where:
 * n = Number of elements in the first list.
 * m = Number of elements in the second list.
 * k = Number of common elements.
 */

public class FindCommonElementsBetweenListsUsingStreams {

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

        Set<String> commonElements = firstList.stream()
                .filter(secondList::contains)
                .collect(Collectors.toSet());

        System.out.println(commonElements);
    }
}