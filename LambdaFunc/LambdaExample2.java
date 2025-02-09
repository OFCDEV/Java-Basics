//Given a list of employee objects with fields name and salary, write a Java program to filter out employees with a salary greater than 50,000 and then extract their names using lambda expressions.
//Hint: Use filter to keep employees with a salary greater than 50,000 and map to extract their names.
package LambdaFunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class LambdaExample2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 60000),
            new Employee("Bob", 40000),
            new Employee("Charlie", 70000)
        );
        List<String> result = employees.stream()
                                       .filter(e -> e.salary > 50000)
                                       .map(e -> e.name)
                                       .collect(Collectors.toList());
        System.out.println(result);
    }
}
