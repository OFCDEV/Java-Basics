package Searching;
public class search_Binary {
    public static void main(String[] args) {
        int arr[] =   {2,3,8,12,34,45,65,76,88,90} ;
        int target = 45;
        int ans = binarySearchGo(arr, target);
        System.out.println(ans);
    }
    static int binarySearchGo(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

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
