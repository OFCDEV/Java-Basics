//Use CountDownLatch to Synchronize Threads Question: Write a Java program to use CountDownLatch to wait for three threads to complete their tasks before proceeding.
package MultiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            latch.countDown();
        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }

        latch.await();
        System.out.println("All threads have finished");
    }
}
