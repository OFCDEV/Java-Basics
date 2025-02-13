//Write a Java program to find the square of each number in a list using lambda expressions and the map method.
package LambdaFunc;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println(squares); // Output: [1, 4, 9, 16, 25]
    }
}

