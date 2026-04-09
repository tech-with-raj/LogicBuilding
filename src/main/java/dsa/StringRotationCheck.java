package main.java.dsa;

/*
Problem: Check if one string is a rotation of another

Example:
Input:
s1 = "INTERVIEW"
s2 = "VIEWINTER"

Output:
true

Approach:
- If lengths are not equal → return false
- Concatenate s1 with itself → s1 + s1
- Check if concatenated string contains s2
*/


public class StringRotationCheck {

    public static void main(String[] args) {

        String s1 = "INTERVIEW";
        String s2 = "VIEWINTER";

        boolean isRotation = isRotation(s1, s2);

        System.out.println("Is Rotation: " + isRotation);
    }

    public static boolean isRotation(String s1, String s2) {

        // Edge case: null or unequal length
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        // Core logic
        String combined = s1 + s1;

        return combined.contains(s2);
    }
}