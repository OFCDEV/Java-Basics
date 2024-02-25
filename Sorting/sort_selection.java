package Sorting;
import java.util.Arrays;

public class sort_selection {
    public static void main(String[] args) {
        int arr[] = {3,54,231,23423,21,21313,32,13};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){
        for(int i=0; i<arr.length;i++){
            //find the max item in the remaining array and swap with correct index value
            int last = arr.length- i-1; //i=index value
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        
        for(int i= start; i <=end ; i++){
            if(arr[max] < arr[i]){
                max= i;
            }
        }
        return max;
    }
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
