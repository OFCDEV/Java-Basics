//Write a Java program to filter numbers divisible by N from a list using lambda expressions and the filter method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByN {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int n = 3;
        List<Integer> divisibleByN = numbers.stream().filter(num -> num % n == 0).collect(Collectors.toList());
        System.out.println(divisibleByN); // Output: [3, 6, 9]
    }
}
