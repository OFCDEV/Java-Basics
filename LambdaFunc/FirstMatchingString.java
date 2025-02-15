//Find the First String that Matches a Condition Question: Write a Java program to find the first string in a list that starts with the letter "b" using lambda expressions and the findFirst method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstMatchingString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Optional<String> result = strings.stream()
                                         .filter(s -> s.startsWith("b"))
                                         .findFirst();
        result.ifPresent(System.out::println); // Output: banana
    }
}
