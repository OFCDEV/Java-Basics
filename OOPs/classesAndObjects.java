package OOPs;
import java.util.Scanner;

class Phone {
    // Properties
    String brand;
    String model;
    int storage;

    // Constructor
    Phone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }
}

public class classesAndObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter phone brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter phone model: ");
        String model = scanner.nextLine();

        System.out.print("Enter phone storage (in GB): ");
        int storage = scanner.nextInt();

        // Creating an object of Phone class
        Phone myPhone = new Phone(brand, model, storage);

        // Displaying phone details
        myPhone.displayDetails();
        scanner.close();
    }
}

