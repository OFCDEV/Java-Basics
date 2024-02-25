package Searching;
public class search_linear4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        System.out.println(linearSearchGo4(arr, target, 3,8));
    }
    public static int linearSearchGo4(int arr[],int target,int start,int end){
        if(target == 0){
            return -1;
        }
        for(int i=start; i<end;i++){
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}
