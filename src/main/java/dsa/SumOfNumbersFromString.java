package main.java.dsa;

public class SumOfNumbersFromString {

    /*
     * Problem Statement:
     * Write a Java program to calculate the sum of all numbers present in a string.
     *
     * Example:
     * Input  : "eye12 kei 56kfd 189 kl"
     * Output : 257
     *
     * Explanation:
     * Numbers present in the string are:
     * 12 + 56 + 189 = 257
     */

    public static void main(String[] args) {

        String input = "eye12kei56kfd189kl";

        int sum = findSumOfNumbers(input);

        System.out.println("Total value is equal to: " + sum);
    }

    public static int findSumOfNumbers(String input) {

        StringBuilder number = new StringBuilder();
        int sum = 0;

        for (char ch : input.toCharArray()) {

            if (Character.isDigit(ch)) {

                number.append(ch);

            } else {

                if (number.length() > 0) {

                    sum += Integer.parseInt(number.toString());

                    number.setLength(0);
                }
            }
        }

        // Handle last number if string ends with digit
        if (number.length() > 0) {

            sum += Integer.parseInt(number.toString());
        }

        return sum;
    }
}