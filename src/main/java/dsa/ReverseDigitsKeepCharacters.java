package main.java.dsa;/*
Problem Statement:
Given a string containing alphabets and digits, reverse only the digits
while keeping alphabet positions unchanged.

Input:
a1b2c3

Output:
a3b2c1

Explanation:
Original digits: 1,2,3
Reversed digits: 3,2,1
Replace digits in original positions.
*/

import java.util.ArrayList;
import java.util.List;

public class ReverseDigitsKeepCharacters {

    public static void main(String[] args) {

        String input = "a1b2c3";

        String result = reverseDigits(input);

        System.out.println("Output : " + result);
    }

    public static String reverseDigits(String input) {

        // Store all digits
        List<Character> digitList = new ArrayList<>();

        for (char ch : input.toCharArray()) {

            if (Character.isDigit(ch)) {
                digitList.add(ch);
            }
        }

        StringBuilder output = new StringBuilder();

        int index = digitList.size() - 1;

        // Replace digits in reverse order
        for (char ch : input.toCharArray()) {

            if (Character.isDigit(ch)) {

                output.append(digitList.get(index));
                index--;

            } else {

                output.append(ch);
            }
        }

        return output.toString();
    }
}