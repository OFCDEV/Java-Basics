package CodingQues;

import java.util.Scanner;

public class armstrong {
    //check if the number is armstrong or not
    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = (sum)+(rem*rem*rem);
            temp/=10;
        }
        if (sum == n) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a num to check:\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
        in.close();
    }
}
