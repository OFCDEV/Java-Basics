package OOPs;

class Phone {
    private String brand;
    private String model;
    private int storage;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.setBrand("Samsung");
        myPhone.setModel("Galaxy S21");
        myPhone.setStorage(128);

        System.out.println("Brand: " + myPhone.getBrand());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Storage: " + myPhone.getStorage() + "GB");
    }
}
