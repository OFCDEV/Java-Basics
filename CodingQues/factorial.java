package CodingQues;

import java.util.Scanner;

public class factorial {
    static int fact(int N){
        if (N == 0 || N == 1) {
            return 1;
        }
        return N*fact(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}
