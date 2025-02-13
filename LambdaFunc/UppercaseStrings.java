//Write a Java program to convert a list of strings to uppercase using lambda expressions and the map method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercased = strings.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        System.out.println(uppercased); // Output: [APPLE, BANANA, CHERRY]
    }
}

