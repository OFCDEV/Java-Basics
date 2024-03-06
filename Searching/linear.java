package Searching;

public class linear {
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i; //index num
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {32,435,462,4234,13322,232,1,67};
        System.out.println(linearSearch(arr, 462));
    }
}
