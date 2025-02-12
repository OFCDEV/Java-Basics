//Write a Java program to filter out vehicles with names containing more than 3 letters and then reverse their names using lambda expressions.
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

public class LambdaExample5 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Vehicle("Car", 150),
            new Vehicle("Bus", 80),
            new Vehicle("Truck", 60)
        );

        List<String> reversedNames = vehicles.stream()
                                             .filter(v -> v.name.length() > 3)
                                             .map(v -> new StringBuilder(v.name).reverse().toString())
                                             .collect(Collectors.toList());

        reversedNames.forEach(System.out::println);
    }
}

