package AnonymousClass;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        //Anonymous Class-An anonymous class is a class without a name. It is used to create a one-time instance of an object with slight modifications or customizations.

        Animal bigFoot = new Animal(){
            public void makeSound(){
                System.out.println("Blah blah");
            }
        };
        bigFoot.makeSound();

        //Using interface
        MyInterface interface1 = new MyInterface() {
            @Override
            public void message(){
                System.out.println("hahaha");
            }
        };
        interface1.message();
    }
}
