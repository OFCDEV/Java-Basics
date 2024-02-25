package Searching;
public class seach_OrderAgnostic {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int target = 2;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
    public static int orderAgnostic(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        //Finding wheather Ascending or Descending
        
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start<=end){
            int mid = start +(end-start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = start+1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid+1;
                }
            }
         }
         return -1;
    }

}

