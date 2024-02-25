package Basics;

import java.util.Scanner;

public class greetFunc {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String myMsg = myGreet(name);
        System.out.println(myMsg);
        sc.close();
    }
    static String myGreet(String name){
        String msg = "Hello " + name;
        return msg;
    }
}
