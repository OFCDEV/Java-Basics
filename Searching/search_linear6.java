package Searching;
public class search_linear6 {
    public static void main(String[] args) {
        int nums[] = {1221,233,322};
       System.out.println(findNumbers(nums));
       System.out.println(digits(3434)); 
    }
    public static int findNumbers(int nums[]){
        int count = 0;
        for(int num = 0; num < nums.length; num++){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
//Function to check wheather a number contains even digit or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
//Count the num of digit
static int digits(int num){
    int count = 0;
    while(num>0){
        count++;
        num = num/10;
    }
    return count;
}
}
