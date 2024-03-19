package Searching;

public class bsearch {
    static int search(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //what if we dont know array is sorted in ascending or descending order.

    static int orderAgnosticBS(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        //Find wheather array is in ascending order or in descending order
        boolean isAsc = arr[start]<arr[end];

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (isAsc) {
                if (target<arr[mid]) {
                    end = mid-1;
                }else if (target>arr[mid]) {
                    start= mid+1;
                }
            }
            else{
                if (target<arr[mid]) {
                   start=mid+1;
                }else if(target>arr[mid]){
                    end = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-30,-29,-1,5,6,19,899};
        int ans = orderAgnosticBS(arr, 19);
        System.out.println(ans);
    }
}
