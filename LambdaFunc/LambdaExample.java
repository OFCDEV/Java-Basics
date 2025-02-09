//Given a list of integers, write a Java program to filter out the even numbers and then square the remaining odd numbers using lambda expressions.

//Hint: Use filter to keep odd numbers and map to square them.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 != 0)
                                      .map(n -> n * n)
                                      .collect(Collectors.toList());
        System.out.println(result);
    }
}

