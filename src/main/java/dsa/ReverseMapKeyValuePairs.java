package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Name: Reverse a Map (Swap Keys and Values)
 *
 * Problem Statement:
 * Given a Map containing key-value pairs, create a new Map by
 * swapping the keys and values.
 *
 * The original Map:
 * Key   → Value
 *
 * should become:
 * Value → Key
 *
 * Example:
 *
 * Input:
 * {
 *   A=1,
 *   B=2,
 *   C=3
 * }
 *
 * Output:
 * {
 *   1=A,
 *   2=B,
 *   3=C
 * }
 *
 * Explanation:
 * Original Mapping:
 * A → 1
 * B → 2
 * C → 3
 *
 * Reversed Mapping:
 * 1 → A
 * 2 → B
 * 3 → C
 *
 * Each value from the original map becomes a key in the reversed map,
 * and each key becomes a value.
 *
 * Note:
 * This approach assumes that all values in the original map are unique.
 * If duplicate values exist, later entries may overwrite previous ones.
 *
 * Approach:
 * 1. Create and populate the original map.
 * 2. Create a new map to store reversed key-value pairs.
 * 3. Traverse all entries of the original map.
 * 4. For each entry:
 *    - Use the value as the new key.
 *    - Use the key as the new value.
 * 5. Insert the swapped pair into the reversed map.
 * 6. Print both maps.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Where:
 * n = Number of entries in the original map.
 */

public class ReverseMapKeyValuePairs {

    public static void main(String[] args) {

        Map<String, Integer> originalMap = new HashMap<>();

        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);

        System.out.println(originalMap);

        Map<Integer, String> reversedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {

            reversedMap.put(
                    entry.getValue(),
                    entry.getKey()
            );
        }

        System.out.println(reversedMap);
    }
}