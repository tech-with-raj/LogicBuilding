package main.java.dsa;

/*
 * Problem Name: Convert Full Name to Shortened Name Format
 *
 * Problem Statement:
 * Given a person's full name, convert it into a shortened format by:
 *
 * 1. Taking the first character of each name part except the last name.
 * 2. Appending a period (.) after each initial.
 * 3. Keeping the last name in its complete form.
 *
 * Example:
 *
 * Input:
 * "Rajasekar Muthu Subramanian"
 *
 * Output:
 * R.M.Subramanian
 *
 * Explanation:
 * Name Parts:
 * Rajasekar
 * Muthu
 * Subramanian
 *
 * Initials:
 * R.
 * M.
 *
 * Last Name:
 * Subramanian
 *
 * Final Result:
 * R.M.Subramanian
 *
 * Approach:
 * 1. Split the full name using whitespace as the delimiter.
 * 2. Traverse all name parts except the last one.
 * 3. Extract the first character from each part.
 * 4. Append the character followed by a period (.).
 * 5. Append the last name without modification.
 * 6. Print the shortened name.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Length of the input string.
 */

public class NameShortener {

    public static void main(String[] args) {

        String fullName = "Rajasekar Muthu Subramanian";

        String[] nameParts = fullName.split(" ");

        StringBuilder shortenedName = new StringBuilder();

        for (int index = 0; index < nameParts.length - 1; index++) {

            shortenedName.append(nameParts[index].charAt(0));
            shortenedName.append(".");
        }

        shortenedName.append(nameParts[nameParts.length - 1]);

        System.out.println(
                "Shorter name of "
                        + fullName
                        + " is "
                        + shortenedName
        );
    }
}