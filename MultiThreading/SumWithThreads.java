package MultiThreading;

//Sum of Elements in an Array Using Multiple Threads Question: Write a Java program to calculate the sum of elements in an array using multiple threads.

public class SumWithThreads {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5};
        int numThreads = 3;
        int sum = calculateSum(numbers, numThreads);
        System.out.println("Sum: " + sum); // Output: Sum: 15
    }

    private static int calculateSum(int[] numbers, int numThreads) throws InterruptedException {
        SumWorker[] workers = new SumWorker[numThreads];
        int length = numbers.length / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * length;
            int end = (i == numThreads - 1) ? numbers.length : start + length;
            workers[i] = new SumWorker(numbers, start, end);
            workers[i].start();
        }
        int totalSum = 0;
        for (SumWorker worker : workers) {
            worker.join();
            totalSum += worker.getSum();
        }
        return totalSum;
    }
}

class SumWorker extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private int sum;

    SumWorker(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
