//Write a Java program to sort a list of strings by their length using lambda expressions and the sorted method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "kiwi");
        List<String> sortedStrings = strings.stream()
                                            .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                                            .collect(Collectors.toList());
        System.out.println(sortedStrings); // Output: [kiwi, apple, banana, cherry]
    }
}

