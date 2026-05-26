package main.java.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Problem Statement:
Given a list of integers containing null values, filter out null elements and
return only numbers that start with digit '1'.

Input:
[1, 23, 78, 124, null, 150]

Output:
[1, 124, 150]
*/

public class FilterNumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(
                1,
                23,
                78,
                124,
                null,
                150
        );

        List<Integer> finalOutput = input.stream()

                // Remove null values
                .filter(Objects::nonNull)

                // Keep numbers starting with digit '1'
                .filter(number -> number.toString().startsWith("1"))

                .collect(Collectors.toList());

        System.out.println("Filtered Output : " + finalOutput);
    }
}