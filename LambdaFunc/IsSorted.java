//Check if an Array is Sorted Question: Write a Java program to check if an array is sorted in ascending order using lambda expressions and the allMatch method.
package LambdaFunc;
import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean isSorted = Arrays.stream(numbers)
                                 .allMatch(i -> i == numbers.length - 1 || numbers[i] <= numbers[i + 1]);
        System.out.println(isSorted); // Output: true
    }
}