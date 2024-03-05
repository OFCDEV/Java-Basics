package CodingQues;

public class maxElement {
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //In a range:
    static int maxInRange(int[] arr,int start,int end){
        int maxIn = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i]>maxIn) {
                maxIn = arr[i];
            }
        }
        return maxIn;
    }
    public static void main(String[] args) {
        int[] arr = {1,45,69,2,3,4};
        System.out.println(max(arr));
    }
}
