package Arrays;
import java.util.*;

public class two_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //For input
        int arr[][] = new int[3][2];
        for(int row =0; row<arr.length;row++){
            for (int col=0; col<arr[row].length;col++ ){
                arr[row][col] = in.nextInt();
            }
        }

        //For Output--Method1
        // for(int row=0; row<arr.length;row++){
        //     for(int col=0; col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+"");
        //     }
        //     System.out.println();
        //method-2
        for(int row=0;row<arr.length;row++){
            System.out.print(Arrays.toString(arr[row]));
            }
            System.out.println();
        }
    }

