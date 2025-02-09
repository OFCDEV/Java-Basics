package MultiThreading;

public class Main {
    public static void main(String[] args) {
        //MultiThreading- Process of executing multiple threads simultaneously which helps in maximum utilization of CPU

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();
    }
}
