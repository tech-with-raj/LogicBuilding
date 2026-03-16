package main.java.dsa;

/*
Problem Statement:
------------------
Insert a hyphen (-) between two identical odd digits in a given numeric string.

Example:
Input  : "99956"
Output : "9-9-956"

Explanation:
If two consecutive digits are:
1. Odd numbers
2. Equal to each other

Then insert '-' between them.

Approach:
---------
1. Traverse the string from index 0 to length - 2.
2. Append the current character to the result.
3. Convert the current and next characters to integers.
4. Check if:
   - Both numbers are odd
   - Both numbers are equal
5. If true, append a hyphen "-".
6. Finally append the last character.

Time Complexity: O(n)
Space Complexity: O(n)
*/



public class InsertHyphenBetweenOddDigits {

    public static void main(String[] args) {

        String input = "99956";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {

            result.append(input.charAt(i));

            int currentDigit = Character.getNumericValue(input.charAt(i));
            int nextDigit = Character.getNumericValue(input.charAt(i + 1));

            // Check if both digits are odd and identical
            if ((currentDigit % 2 != 0) &&
                    (nextDigit % 2 != 0) &&
                    (currentDigit == nextDigit)) {

                result.append("-");
            }
        }

        // Append last character
        result.append(input.charAt(input.length() - 1));

        System.out.println(result);
    }
}