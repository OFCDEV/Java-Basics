package CodingQues;

public class maxIn2d {
    public static void main(String[] args) {
        int [][] arr = {{23,4,1},{18,12,3,9},{78,99,34,56},{18,12}};
        System.out.println(max(arr));
    }
    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
