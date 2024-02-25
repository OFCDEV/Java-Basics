package Sorting;
import java.util.Arrays;

public class sort_selection3 {
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,7,8,0,-13};
        selectionSortGo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSortGo(int arr[]){
        for(int i=0; i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
   
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;

    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//I skip insertion sort and cycle sort