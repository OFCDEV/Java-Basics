package Arrays;

public class minimum {
    static int min(int[]arr){
        if (arr.length == 0) {
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
