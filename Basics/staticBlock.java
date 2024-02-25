package Basics;
public class staticBlock {
    static int a = 5;
    static int b;

    static{
        System.out.println("I am in static block");
        b = a*4;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a +" "+ staticBlock.b);

        staticBlock.b += 3;
        System.out.println("Value of b is "+staticBlock.b);

        System.out.println(staticBlock.a +" "+ staticBlock.b);
    }
}
