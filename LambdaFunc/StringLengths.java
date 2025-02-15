//Find the Length of Each String in a List Question: Write a Java program to find the length of each string in a list using lambda expressions and the map method.
package LambdaFunc;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengths {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = strings.stream()
                                       .map(String::length)
                                       .collect(Collectors.toList());
        System.out.println(lengths); // Output: [5, 6, 6]
    }
}
