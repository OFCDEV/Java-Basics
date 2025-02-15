//Use CyclicBarrier for Thread Coordination Question: Write a Java program to use CyclicBarrier to wait for four threads to reach a common barrier point before continuing.
package MultiThreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4, () -> {
            System.out.println("All threads have reached the barrier");
        });

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 4; i++) {
            new Thread(task).start();
        }
    }
}
