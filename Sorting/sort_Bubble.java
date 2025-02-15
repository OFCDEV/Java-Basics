package Sorting;
//Bubble sort is a comparing sorting method

import java.util.Arrays;

public class sort_Bubble {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        //run the steps n-1 times

        for(int i=0; i<arr.length;i++){
            //for each step max item will come at the last respective index
            for(int j=1; j<arr.length-i;j++){
                //swap if the item is smaller than previous
                if(arr[j]< arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
