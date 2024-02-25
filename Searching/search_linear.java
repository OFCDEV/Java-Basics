package Searching;
//Search in an Array
public class search_linear{
    public static void main(String[] args) {
        int arr[] = {1,23,54,5,2,3,55,32,3123};
        int target = 3;
        int ans = linearSearchGo(arr, target);
        System.out.println(ans);
    }
    public static int linearSearchGo(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}