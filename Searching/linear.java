package Searching;

public class linear {
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; //index num
            }
        }
        return -1;
    }
    //FOr string
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {32,435,462,4234,13322,232,1,67};
        System.out.println(linearSearch(arr, 462));
        String name = "devv";
        System.out.println(search(name, 'e'));
    }
}
