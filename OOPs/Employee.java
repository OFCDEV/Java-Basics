//Create a class "Employee" with attributes name and salary. Implement overloaded operators + and - to combine and compare employees based on their salaries.
package OOPs;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double sal) {
        this.name = name;
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public boolean lessThan(Employee other) {
        return salary < other.salary;
    }

    public boolean greaterThan(Employee other) {
        return salary > other.salary;
    }

    // This method returns a new member having combined salary of both.
    public Employee add(Employee other) {
        return new Employee("Combined", salary + other.salary);
    }

    public Employee subtract(Employee other) {
        return new Employee("Diference", salary - other.salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Debasish", 50000);
        Employee emp2 = new Employee("Arsia", 60000);

        if (emp1.lessThan(emp2)) {
            System.out.println(emp2.name+" has a higher salary than " +emp1.name);
        }else{
            System.out.println(emp2.name+" has a lesser salary than " +emp1.name);
        }

        Employee combined = emp1.add(emp2);
        System.out.println("Combined Salary: " + combined.getSalary());

        Employee difference = emp2.subtract(emp1);
        System.out.println("Salary Difference: " + difference.getSalary());

    }
}
