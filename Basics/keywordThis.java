package Basics;
 class Student{
    int rNo;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is " +name);
    }

    void changeName(String newName){
        name = newName;
    }

    Student(){
        this.rNo = 13;
        this.marks = 88.5f;
        this.name = "Debasish";
    }

    Student(int rNo , String name , float marks){
        this.rNo = rNo;
        this.marks = marks;
        this.name = name;
    }

    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
    }
}
public class keywordThis{
    public static void main(String[] args) {
        Student dev = new Student();
        System.out.println(dev.marks);
        System.out.println(dev.name);
        System.out.println(dev.rNo);

        Student simi = new Student(21, "Dibyasa", 88.5f);
        // System.out.println(simi.name);

        // Student simi = new Student();
        // System.out.println(simi.marks);

        Student random = new Student(dev);
        System.out.println(random.name);

        dev.changeName("Lwda");
        dev.greeting();

    }
}