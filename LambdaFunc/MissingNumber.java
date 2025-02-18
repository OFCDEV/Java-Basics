package LambdaFunc;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] numbers) {
        int n = 10;
        int actualSum = Arrays.stream(numbers).sum();
        int expectedSum = n * (n + 1) / 2;
        return expectedSum - actualSum;
    }
}

