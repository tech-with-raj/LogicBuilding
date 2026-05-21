package main.java.dsa;

import java.util.Arrays;
import java.util.List;

/*
Problem: Microservice Health Monitor

Problem Statement:
A company runs 3 microservices every day.
At the end of each day, the status of all microservices is recorded as a string.

'Y' -> Microservice working
'N' -> Microservice failed

Each element in the list represents one day's status of all microservices.

Task:
Find the longest streak of consecutive days where all microservices passed.

Rules:
1. If a day's string contains only 'Y'
   -> That day contributes to the streak

2. If a day's string contains even one 'N'
   -> Streak resets to 0

3. Return the maximum streak found

Example:

Input:
["YYY", "YNY", "YYY", "YYY", "YYY"]

Explanation:

Day1 -> "YYY" -> Streak = 1
Day2 -> "YNY" -> Contains N -> Reset streak = 0
Day3 -> "YYY" -> Streak = 1
Day4 -> "YYY" -> Streak = 2
Day5 -> "YYY" -> Streak = 3

Output:
3
*/

public class MaxStreakProblem {

    public static void main(String[] args) {

        List<String> weekLogs =
                Arrays.asList("YYY", "YNY", "YYY", "YYY", "YYY");

        int maxStreak = calculateMaxStreak(weekLogs);

        System.out.println("Max Streak : " + maxStreak);
    }

    private static int calculateMaxStreak(List<String> weekLogs) {

        int currentStreak = 0;
        int maxStreak = 0;

        for (String data : weekLogs) {

            if (!data.contains("N")) {

                currentStreak++;

                maxStreak = Math.max(
                        currentStreak,
                        maxStreak
                );

            } else {

                currentStreak = 0;
            }
        }

        return maxStreak;
    }
}