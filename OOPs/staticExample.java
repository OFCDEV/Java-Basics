package OOPs;

public class staticExample {
    static int counter = 0;
    static void increment() {
        counter++;
    }
    void displayCounter(){
        System.out.println("Counter: " + counter);
    }
    static class NestedStaticClass{
        void show(){
            System.out.println("Static Nested Class");
        }
    }
    public static void main(String[] args) {

        //Accessing static variable and method without creating an instance of it
        staticExample.increment();
        staticExample.increment();

        staticExample instance = new staticExample();
        instance.displayCounter();

        staticExample.NestedStaticClass nestedInstance = new staticExample.NestedStaticClass();
        nestedInstance.show();
    }
}
