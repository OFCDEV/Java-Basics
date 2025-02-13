//Write a Java program to find distinct elements in a list using lambda expressions and the distinct method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println(distinctNumbers); // Output: [1, 2, 3, 4, 5]
    }
}

