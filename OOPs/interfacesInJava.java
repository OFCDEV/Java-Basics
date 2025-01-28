package OOPs;

interface Camera {
    void takePhoto();
}

interface GPS {
    void navigate();
}

class SmartPhone implements Camera, GPS {
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void navigate() {
        System.out.println("Navigating to the destination...");
    }
}

public class interfacesInJava {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.takePhoto();
        myPhone.navigate();
    }
}

