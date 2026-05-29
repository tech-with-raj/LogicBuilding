package main.java.dsa;

import java.util.HashMap;
import java.util.Map;


/*
Problem: Hackathon Score Calculator

Description:
Erica and Bob participate in a hackathon where they solve one problem each day.
Each solved problem has a difficulty level represented by a character:

E = Easy   = 1 point
M = Medium = 3 points
H = Hard   = 5 points

You are given two strings:
- erica : Problems solved by Erica
- bob   : Problems solved by Bob

Each character in the string represents the difficulty of the problem solved on that day.

Task is to:
1. Calculate the total score for Erica.
2. Calculate the total score for Bob.
3. Determine the winner based on the higher score.

Return:
- "Erica" if Erica's score is greater.
- "Bob" if Bob's score is greater.
- "Tie" if both scores are equal.

Example 1:
Input:
erica = "EMH"
bob   = "HME"

Calculation:
Erica = E(1) + M(3) + H(5) = 9
Bob   = H(5) + M(3) + E(1) = 9

Output:
Tie

Example 2:
Input:
erica = "HHH"
bob   = "MMM"

Calculation:
Erica = H(5) + H(5) + H(5) = 15
Bob   = M(3) + M(3) + M(3) = 9

Output:
Erica

Constraints:
1 <= erica.length() = bob.length() <= 100

Each character in both strings is one of:
'E', 'M', or 'H'
*/

public class HackathonScoreCalculator {

    public static void main(String[] args) {

        String erica = "EMH";
        String bob = "HME";

        if (erica.length() != bob.length()) {

            System.err.println("Error: Erica and Bob must have solved problems for the same number of days.");
            System.exit(0);
        }

        Map<Character, Integer> scoreCard = new HashMap<>();
        scoreCard.put('E', 1);
        scoreCard.put('M', 3);
        scoreCard.put('H', 5);

        int ericaFinalPoints = 0;
        int bobFinalPoints = 0;

        for (int i = 0; i < erica.length(); i++) {

            char ericaPoint = erica.charAt(i);
            char bobPoint = bob.charAt(i);

            ericaFinalPoints += scoreCard.get(ericaPoint);
            bobFinalPoints += scoreCard.get(bobPoint);
        }

        if (ericaFinalPoints > bobFinalPoints) {

            System.out.println("Erica is the Winner with points: " + ericaFinalPoints);

        } else if (bobFinalPoints > ericaFinalPoints) {

            System.out.println("Bob is the Winner with points: " + bobFinalPoints);

        } else {

            System.out.println("Tie");
        }
    }
}