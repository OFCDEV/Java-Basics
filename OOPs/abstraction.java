package OOPs;

abstract class Phone {
    String brand;
    String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    abstract void makeCall();

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class SmartPhone extends Phone {
    int storage;

    SmartPhone(String brand, String model, int storage) {
        super(brand, model);
        this.storage = storage;
    }

    @Override
    void makeCall() {
        System.out.println("Making a video call...");
    }
}

public class abstraction {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Motorola", "g73", 256);
        myPhone.displayDetails();
        myPhone.makeCall();
    }
}

