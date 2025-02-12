//Write a Java program to demonstrate the use of synchronized keyword to avoid race conditions when two threads access the same shared resource.
package MultiThreading;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadExample2 implements Runnable {
    private Counter counter;

    ThreadExample2(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new ThreadExample2(counter));
        Thread thread2 = new Thread(new ThreadExample2(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());
        // Output: Final count: 2000
    }
}

