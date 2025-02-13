//Write a Java program to calculate the factorial of a number using lambda expressions and reduce method.
package LambdaFunc;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = IntStream.rangeClosed(1, number)
                                 .reduce(1, (a, b) -> a * b);
        System.out.println(factorial); // Output: 120
    }
}

