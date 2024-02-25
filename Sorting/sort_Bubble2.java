package Sorting;
import java.util.Arrays;

public class sort_Bubble2 {
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,6,9,8};
        bubbleGo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleGo(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
