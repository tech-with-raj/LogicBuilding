package main.java.dsa;

/*
Problem: Extract Alphabets and Sum Digits from String

Input:
r@56vi ku$%mar67

Output:
rvi kumar 24

Approach:
1. Traverse each character in input string
2. Keep only alphabets and spaces
3. Sum all digits
4. Append digit sum at end

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ExtractAlphabetsAndSumDigits {

    public static void main(String[] args) {

        String input = "r@56vi ku$%mar67";

        String result = extractCharactersAndDigitSum(input);

        System.out.println(result);
    }

    public static String extractCharactersAndDigitSum(String input) {

        StringBuilder extractedText = new StringBuilder();

        int digitSum = 0;

        for (char currentChar : input.toCharArray()) {

            // Keep only letters and spaces
            if (Character.isLetter(currentChar) || currentChar == ' ') {

                extractedText.append(currentChar);

            }

            // Add digit values
            else if (Character.isDigit(currentChar)) {

                digitSum += Character.getNumericValue(currentChar);

            }
        }

        extractedText.append(" ");
        extractedText.append(digitSum);

        return extractedText.toString();
    }
}