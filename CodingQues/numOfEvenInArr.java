package CodingQues;

public class numOfEvenInArr {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,8796};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
     static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits%2 == 0;
    }
    static int digits(int num){

        if (num<0) {
            num*=-1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
