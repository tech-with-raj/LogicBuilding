package main.java.dsa;

import java.util.ArrayList;

/*
 * Problem Name: Identify Even and Odd Numbers from a Mixed ArrayList
 *
 * Problem Statement:
 * Given an ArrayList containing different types of objects such as
 * Strings, Integers, and Decimal values, identify the Integer elements
 * and determine whether each Integer is Even or Odd.
 *
 * Example:
 *
 * Input:
 * ["Java", 24, "Raj", 23, 21.98]
 *
 * Output:
 * Even value 24
 * Odd value 23
 *
 * Explanation:
 * - "Java" is a String and is ignored.
 * - 24 is an Integer and is Even.
 * - "Raj" is a String and is ignored.
 * - 23 is an Integer and is Odd.
 * - 21.98 is a Double and is ignored.
 *
 * Approach:
 * 1. Create an ArrayList containing mixed data types.
 * 2. Traverse each element using an enhanced for loop.
 * 3. Check whether the element is an Integer using instanceof.
 * 4. Type cast the object to Integer.
 * 5. Use the modulus operator (%) to determine whether the number is Even or Odd.
 * 6. Print the result for each Integer value.
 * 7. Ignore all non-Integer elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Where:
 * n = Number of elements in the ArrayList.
 */

public class EvenOrOddFromMixedArrayList {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add(24);
        arrayList.add("Raj");
        arrayList.add(23);
        arrayList.add(21.98);

        for (Object object : arrayList) {

            if (object instanceof Integer) {

                if (((Integer) object) % 2 == 0) {

                    System.out.println("Even value " + object);

                } else {

                    System.out.println("Odd value " + object);
                }
            }
        }
    }
}