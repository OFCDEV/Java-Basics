//Write a Java program to find all prime numbers in a list using lambda expressions and the filter method.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primes = numbers.stream()
                                      .filter(PrimeNumbers::isPrime)
                                      .collect(Collectors.toList());
        System.out.println(primes); // Output: [2, 3, 5, 7]
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}
