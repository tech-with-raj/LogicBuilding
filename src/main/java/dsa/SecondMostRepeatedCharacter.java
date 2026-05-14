package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedCharacter {

    public static void main(String[] args) {

        String input = "aabbbcccc";

        char result = findSecondMostRepeatedCharacter(input);

        if (result != ' ') {
            System.out.println("Second most repeated char is " + result);
        } else {
            System.out.println("No second most repeated character found");
        }
    }

    public static char findSecondMostRepeatedCharacter(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        int firstMaxFrequency = 0;
        int secondMaxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            int currentFrequency = entry.getValue();

            if (currentFrequency > firstMaxFrequency) {

                secondMaxFrequency = firstMaxFrequency;
                firstMaxFrequency = currentFrequency;

            } else if (currentFrequency > secondMaxFrequency
                    && currentFrequency < firstMaxFrequency) {

                secondMaxFrequency = currentFrequency;
            }
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() == secondMaxFrequency) {
                return entry.getKey();
            }
        }

        return ' ';
    }
}