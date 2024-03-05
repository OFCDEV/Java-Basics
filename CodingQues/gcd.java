package CodingQues;

public class gcd {
    static int findGCD(int a,int b){
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a==b) {
            return a;
        }
        if (a>b) {
            return findGCD(a-b,b);
        }
        return findGCD(a,b-a);
    }
    public static void main(String[] args) {
        System.out.println(findGCD(98, 56));
    }
}
