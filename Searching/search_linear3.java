package Searching;
//Serach in a String2
public class search_linear3 {
    public static void main(String[] args) {
        String name = "Devvv";
        char target = 'e';
        System.out.println(linearSearchGo3(name, target));
    }
    public static boolean linearSearchGo3(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
