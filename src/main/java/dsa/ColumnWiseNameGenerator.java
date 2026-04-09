package main.java.dsa;

/**
 * Problem:
 * Generate a string by reading characters column-wise
 * from an array of strings.
 *
 * Example:
 * Input  : {"Raj", "Rahul", "Amit"}
 * Output : RRAaamjhiutl
 *
 * Approach:
 * 1. Find maximum length among all strings
 * 2. Traverse column-wise
 * 3. Append characters if index exists
 *
 * Time Complexity  : O(n * m)
 * Space Complexity : O(1) (excluding output)
 */
public class ColumnWiseNameGenerator {

    public static String generateName(String[] names) {

        if (names == null || names.length == 0) {
            return "";
        }

        // Step 1: Find maximum length
        int maxLength = 0;
        for (String name : names) {
            if (name != null) {
                maxLength = Math.max(maxLength, name.length());
            }
        }

        StringBuilder result = new StringBuilder();

        // Step 2: Column-wise traversal
        for (int col = 0; col < maxLength; col++) {
            for (String name : names) {
                if (name != null && col < name.length()) {
                    result.append(name.charAt(col));
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String[] names = {"Raj", "Rahul", "Amit"};

        String output = generateName(names);

        System.out.println("Generated Name: " + output);
        // Expected Output: RRAaamjhiutl
    }
}