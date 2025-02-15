//Use ExecutorService to Run Multiple Tasks Question: Write a Java program using ExecutorService to create a thread pool with 4 threads and submit 8 tasks to it. Each task should print its thread name and a unique task ID.
package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 8; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " executing task " + taskId);
            });
        }

        executor.shutdown();
    }
}
