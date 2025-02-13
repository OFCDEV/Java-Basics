//Write a Java program to find the maximum element in a list using lambda expressions and the max method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println); // Output: 5
    }
}

