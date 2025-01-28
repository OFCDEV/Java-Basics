package OOPs;
// Base Class
class Phone {
    String brand;
    String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Derived Class
class SmartPhone extends Phone {
    int storage;

    SmartPhone(String brand, String model, int storage) {
        super(brand, model);
        this.storage = storage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Storage: " + storage + "GB");
    }
}

public class inheritance {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Apple", "iPhone 13", 256);
        myPhone.displayDetails();
    }
}

