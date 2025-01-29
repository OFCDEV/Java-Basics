// Create a base class "Shape" with methods to calculate the area and perimeter (pure virtual). Implement derived classes "Rectangle" and "Circle" that inherit from "Shape" and provide their own area and perimeter calculations.
package OOPs;


    abstract class Shape{
        public abstract double area();
        public abstract double perimeter(); 
    }
    class Rectangle extends Shape{
        private double length;
        private double breadth;

        Rectangle(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }
        @Override
        public double area(){
            return length*breadth;
        }
        @Override
        public double perimeter(){
            return 2*(length+breadth);
        }
    }
    class Circle extends Shape{
        private double radius;

        Circle(double radius){
            this.radius = radius;
        }
        @Override
        public double area(){
            return Math.PI*radius*radius;
        }
        @Override
        public double perimeter(){
            return 2*Math.PI*radius;
        }
    }
public class Q2 {
   public static void main(String[] args) {
    Shape shape1 = new Rectangle(3, 4);
    Shape shape2 = new Circle(5);

    System.out.println("Area of the Rectangle is: "+shape1.area());
    System.out.println("Perimeter of the Rectangle is: "+shape1.perimeter());

    System.out.println("Area of the circle is: "+shape2.area());
    System.out.println("Perimeter of the circle is: "+shape2.perimeter());
   }

    
}
