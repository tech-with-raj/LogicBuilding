package main.java.dsa;

import java.util.Stack;

/*
 * Problem Name: Valid Parentheses
 *
 * Problem Statement:
 * Given a string containing parentheses, determine whether the
 * parentheses are balanced and valid.
 *
 * A string is considered valid if:
 * 1. Every opening parenthesis '(' has a corresponding closing parenthesis ')'.
 * 2. Parentheses are closed in the correct order.
 * 3. No closing parenthesis appears before its matching opening parenthesis.
 *
 * Example 1:
 *
 * Input:
 * "()"
 *
 * Output:
 * true
 *
 * Explanation:
 * The opening parenthesis is correctly matched with a closing parenthesis.
 *
 * Example 2:
 *
 * Input:
 * "(()"
 *
 * Output:
 * false
 *
 * Explanation:
 * One opening parenthesis remains unmatched.
 *
 * Example 3:
 *
 * Input:
 * ")("
 *
 * Output:
 * false
 *
 * Explanation:
 * A closing parenthesis appears before any opening parenthesis.
 *
 * Approach:
 * 1. Create a Stack to store opening parentheses.
 * 2. Traverse each character in the input string.
 * 3. If an opening parenthesis is found:
 *    - Push it onto the stack.
 * 4. If a closing parenthesis is found:
 *    - Check whether the stack is empty.
 *    - If empty, the string is invalid.
 *    - Otherwise, pop the top element.
 * 5. Verify that the popped element matches the expected opening parenthesis.
 * 6. After processing all characters:
 *    - The stack must be empty for the string to be valid.
 * 7. Return the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class ValidParentheses {

    public static void main(String[] args) {

        String input = "()";

        System.out.println(isValidParentheses(input));
    }

    public static boolean isValidParentheses(String input) {

        char[] characters = input.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char currentCharacter : characters) {

            if (currentCharacter == '(') {

                stack.push(currentCharacter);

            } else {

                if (stack.isEmpty()) {

                    return false;

                } else {

                    char topCharacter = stack.pop();

                    if (topCharacter != '(') {

                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}