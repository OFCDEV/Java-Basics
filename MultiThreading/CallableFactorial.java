//Implement Callable and Future to Calculate Factorial Question: Write a Java program to calculate the factorial of a number using Callable and Future.
package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFactorial {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            int number = 5;
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Factorial: " + future.get()); // Output: Factorial: 120

        executor.shutdown();
    }
}
