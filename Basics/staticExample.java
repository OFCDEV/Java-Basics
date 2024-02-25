package Basics;
class Human {
    int age;
    String name;
    int salary;
    boolean maried;
    static long population; //Static keyword are those property which aren't directly related to obj/ same for all

    public Human(int age, String name, int salary, boolean maried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.maried = maried;
        Human.population += 1;
    }
}
public class staticExample{
    public static void main(String[] args) {
        Human dev = new Human(19, "Debasish", 80000, false);
        Human simi = new Human(12, "Dibyasa", 00, false);
        // System.out.println(dev.population);
        System.out.println(Human.population);
    }
}
