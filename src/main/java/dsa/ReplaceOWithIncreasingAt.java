package main.java.dsa;/*
Problem Statement:
Given a string, replace every occurrence of the character 'o' (or 'O')
with an increasing number of '@' symbols.

Example:
Input  : Tomorrow
Output : T@m@@rr@@@w

Explanation:
1st 'o' -> @
2nd 'o' -> @@
3rd 'o' -> @@@
and so on.

Approach:
1. Convert the string into a character array.
2. Traverse each character.
3. Maintain a counter for occurrences of 'o' or 'O'.
4. Replace each occurrence with '@' repeated based on the count.
5. Append other characters as they are.
*/

class ReplaceOWithIncreasingAt {

    public static void main(String[] args) {

        String input = "Tomorrow";

        int oCount = 0;
        StringBuilder result = new StringBuilder();

        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {

            if (c == 'o' || c == 'O') {
                oCount++;
                result.append("@".repeat(oCount));
            }
            else {
                result.append(c);
            }
        }

        System.out.println("Input  : " + input);
        System.out.println("Output : " + result);
    }
}