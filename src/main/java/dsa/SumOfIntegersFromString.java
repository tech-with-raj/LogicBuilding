package main.java.dsa;

/*
 * Problem Name: Sum of All Integers Present in a String
 *
 * Problem Statement:
 * Given a sentence containing words, numbers, and special characters,
 * extract all integer values present in the string and calculate their sum.
 *
 * The program should:
 * 1. Identify numeric values embedded within the text.
 * 2. Ignore alphabets and special characters.
 * 3. Convert extracted numeric values into integers.
 * 4. Calculate and print the total sum.
 *
 * Example:
 *
 * Input:
 * "Room 101 is ready for guest 502, staying for 3 nights,
 * check-in at 12 PM, checkout on day 4, booking ID 78945,
 * and service request 9001 is confirmed."
 *
 * Output:
 * Found number: 101
 * Found number: 502
 * Found number: 3
 * Found number: 12
 * Found number: 4
 * Found number: 78945
 * Found number: 9001
 *
 * Sum of all integers = 88568
 *
 * Explanation:
 * Extracted Numbers:
 *
 * 101
 * 502
 * 3
 * 12
 * 4
 * 78945
 * 9001
 *
 * Total:
 *
 * 101 + 502 + 3 + 12 + 4 + 78945 + 9001
 * = 88568
 *
 * Approach:
 * 1. Split the input sentence into individual words.
 * 2. Traverse each word.
 * 3. Remove all non-digit characters using Regular Expressions.
 * 4. Check whether the resulting string contains a valid number.
 * 5. Convert the number string into an integer.
 * 6. Add the value to the running sum.
 * 7. Print every extracted number.
 * 8. Print the final sum after processing all words.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Total number of characters in the input string.
 */

public class SumOfIntegersFromString {

    public static void main(String[] args) {

        String input =
                "Room 101 is ready for guest 502, staying for 3 nights, "
                        + "check-in at 12 PM, checkout on day 4, booking ID 78945, "
                        + "and service request 9001 is confirmed.";

        String[] words = input.split(" ");

        int sum = 0;

        for (String word : words) {

            // Remove all non-digit characters
            word = word.replaceAll("[^0-9]", "");

            // Process only valid numbers
            if (!word.isEmpty()) {

                try {

                    int number = Integer.parseInt(word);

                    System.out.println("Found number: " + number);

                    sum += number;

                } catch (NumberFormatException exception) {

                    // Ignore invalid numeric conversions
                }
            }
        }

        System.out.println("\nSum of all integers = " + sum);
    }
}