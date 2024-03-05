package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();//Taking user-input
        }
        System.out.println(Arrays.toString(arr));


        //Enchanced for loop
        // for (int i : arr) {
        //     System.out.println(arr[i]);
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//Printing that
        }
        sc.close();
    }
}
