package Searching;
public class search_linear5 {
    public static void main(String[] args) {
        int arr[] = {2,1,4,89,22,12};
        System.out.println(linearSearch5Go(arr));
    }
    public static int linearSearch5Go(int arr[]){
        int ans = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
