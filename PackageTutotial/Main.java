package PackageTutotial;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(1.9, 5.5, 6.9);
        Box box2 = new Box(box1);
        System.out.println(box1.h+" "+ box1.l+" "+box1.w);

        BoxWeight box3 = new BoxWeight(2.1, 10.2, 30.1, 66.8);

        Box box4 = new BoxWeight(10, 20, 30, 40); //Parent class reffering child class
    }
}
