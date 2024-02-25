package Basics;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check armstrong or not: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
    static boolean isArmstrong(int n){
        int sum=0;
        int org =n;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum = sum + rem*rem*rem;
        }
        return sum == org;
    }
}
