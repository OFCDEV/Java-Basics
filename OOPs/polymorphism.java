package OOPs;

//Method Overriding
class Phone {
    void makeCall() {
        System.out.println("Making a call...");
    }
}

class SmartPhone extends Phone {
    @Override
    void makeCall() {
        System.out.println("Making a video call...");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.makeCall(); // Output: Making a call...

        Phone mySmartPhone = new SmartPhone();
        mySmartPhone.makeCall(); // Output: Making a video call...
    }
}

