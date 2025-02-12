//Given a list of Vehicle objects, write a Java program to filter out vehicles with a max speed less than 80 and then create a new Vehicle object with a discounted max speed (20% off) for the remaining vehicles using lambda expressions.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Vehicle {
    String name;
    int maxSpeed;
    Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
}

public class LambdaExample4 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Vehicle("Car", 150),
            new Vehicle("Bike", 80),
            new Vehicle("Truck", 60)
        );

        List<Vehicle> discountedVehicles = vehicles.stream()
                                                   .filter(v -> v.maxSpeed >= 80)
                                                   .map(v -> new Vehicle(v.name, (int) (v.maxSpeed * 0.8)))
                                                   .collect(Collectors.toList());

        discountedVehicles.forEach(v -> System.out.println(v.name + ": " + v.maxSpeed));
    }
}

