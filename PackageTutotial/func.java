package PackageTutotial;

import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("The summation is: "+ans);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        sc.close();
        return sum;
    }
}
