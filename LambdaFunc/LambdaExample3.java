//Given a list of Vehicle objects with fields name and maxSpeed, 
//write a Java program to filter out vehicles with a max speed greater than 100 and then print their names using lambda expressions.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;

class Vehicle {
    String name;
    int maxSpeed;
    Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
}

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Vehicle("Car", 150),
            new Vehicle("Bike", 80),
            new Vehicle("Truck", 60)
        );

        vehicles.stream()
                .filter(v -> v.maxSpeed > 100)
                .map(v -> v.name)
                .forEach(System.out::println);
    }
}

