package main.java.dsa;

import java.util.HashMap;

/*
 * Problem Name: Convert Roman Numeral to Integer
 *
 * Problem Statement:
 * Given a Roman numeral string, convert it into its corresponding
 * integer value.
 *
 * This implementation supports the Roman symbols:
 *
 * I = 1
 * V = 5
 * X = 10
 *
 * Roman numeral rules:
 * - If a symbol is followed by a symbol of equal or smaller value,
 *   its value is added.
 * - If a symbol is followed by a symbol of greater value,
 *   its value is subtracted.
 *
 * Example:
 *
 * Input:
 * XVI
 *
 * Output:
 * Integer value of Roman Number XVI is 16
 *
 * Explanation:
 * XVI = X + V + I
 *     = 10 + 5 + 1
 *     = 16
 *
 * Example:
 *
 * Input:
 * IV
 *
 * Output:
 * 4
 *
 * Explanation:
 * I appears before V.
 *
 * Therefore:
 * 5 - 1 = 4
 *
 * Approach:
 * 1. Create a HashMap to store Roman symbols and their integer values.
 * 2. Traverse the Roman numeral from right to left.
 * 3. For each symbol, retrieve its numeric value.
 * 4. Compare it with the previous processed value.
 * 5. If the current value is greater than or equal to the previous value:
 *    - Add it to the result.
 * 6. Otherwise:
 *    - Subtract it from the result.
 * 7. Update the previous value.
 * 8. Print the final integer result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Length of the Roman numeral string.
 */

public class RomanNumeralToIntegerConverter {

    public static void main(String[] args) {

        String romanNumeral = "XVI";

        int result = 0;
        int previousValue = 0;

        HashMap<Character, Integer> romanValueMap = new HashMap<>();

        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);

        for (int index = romanNumeral.length() - 1; index >= 0; index--) {

            char currentSymbol = romanNumeral.charAt(index);

            int currentValue = romanValueMap.get(currentSymbol);

            if (currentValue >= previousValue) {

                result = result + currentValue;

            } else {

                result = result - currentValue;
            }

            previousValue = currentValue;
        }

        System.out.println(
                "Integer value of Roman Number "
                        + romanNumeral
                        + " is "
                        + result
        );
    }
}