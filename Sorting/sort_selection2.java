package Sorting;
import java.util.Arrays;

public class sort_selection2 {
    public static void main(String[] args) {
       int arr[]= {2,1,3,4,22,11,0};
       selectionGo(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void selectionGo(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i= start; i<=end;i++){
        if(arr[max]<arr[i]){
            max = i;
        }
       }
       return max;
    }
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
