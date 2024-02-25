package Searching;
public class search_Binary2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int ans = binarySearch2Go(arr, target);
        System.out.println(ans);
    }
    public static int binarySearch2Go(int arr[], int target){
        int start = 0; 
        int end =arr.length-1;

        while(start <= end){
            int mid =  start +(end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
