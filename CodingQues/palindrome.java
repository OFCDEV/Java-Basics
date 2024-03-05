package CodingQues;

public class palindrome {
    static boolean isPalindrome(int N){
        int temp = N;
        int rev = 0;
        while (N>0) {
            rev = 10*rev+N%10;
            N=N/10;
        }
        if (rev == temp) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
