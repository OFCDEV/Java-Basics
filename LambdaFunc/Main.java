package LambdaFunc;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();

        printThing(myCat);// Outputs the same i,e MeowN

        //Now comes the use of lambda 
        //Instead of passing the object(myCat) which implements the print() method, we are directly passing that method

        //Remember that lambda func doesn't need access type, return type and the name of the method.
        printThing(
            () -> {
                System.out.println("Meow");
            }
        );

        //If the implementation that we are passing is a single line then
        printThing(()->{System.out.println("Single Meow");});

        //Also we can save the implementation inside of a variable
        Printable lambdaPrintable = () -> System.out.println("Meow");

        //Here we pass the variable as a parameter for printThing method.
        printThing(lambdaPrintable);
    }



    static void printThing(Printable things){
        things.print();
    }
}
